package com.training.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExample {
	
	WebDriver driver;
	WebDriverWait wait;
	

	@Test(alwaysRun = true)
	@Parameters({"browser","appURL"})
	public void launchApp(String browser,String appURL) {
		if(browser.equals("chrome")) {
			// set the chromedriver.exe path to launch chrome browser
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// driver
			// open the chrome browser

			driver = new ChromeDriver();
			// ChromeDriver driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");//driver
			//open the firefox browser
			 driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");//driver
			//open the IE browser
			driver = new InternetExplorerDriver();
		}
		 
		// open the application url in browser
		driver.get(appURL);
		// driver.navigate().to(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(dependsOnMethods = "launchApp")
	@Parameters({ "username", "password" })
	public void loginToAutoPract(String username, String password) throws InterruptedException {
		// click on Signin button
		driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();

		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#email")));
		System.out.println("username from xml -->" + username);
		System.out.println("password from xml -->" + password);
		driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#passwd")).sendKeys(password);

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='SubmitLogin'] span")));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")));

		WebElement loginEle = driver.findElement(By.cssSelector("button[id='SubmitLogin'] span"));
		// loginEle.click();

		String pageTitle = jse.executeScript("return document.title;").toString();

		System.out.println("page title -->" + pageTitle);
		Assert.assertEquals(pageTitle, "Login - My Store");

		jse.executeScript("arguments[0].click();", loginEle);

	}

	@Test(dependsOnMethods = "loginToAutoPract")
	public void validateErrorMsg() {

		String errMsg = driver.findElement(By.cssSelector("div[class*='alert-danger'] p")).getText();
		String errMsg2 = driver.findElement(By.cssSelector("div[class*='alert-danger'] li")).getText();

		System.out.println("Error msg1" + errMsg + " Error Msg 2 -->" + errMsg2);

		Assert.assertEquals(errMsg, "There is 1 error");
		Assert.assertEquals(errMsg2, "Authentication failed.", "application not displaying expected error msg");

	}

	@AfterTest
	public void closeMyBrowser() {
		driver.quit();
	}

}
