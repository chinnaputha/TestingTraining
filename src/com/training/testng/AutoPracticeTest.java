package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.automation.TestBaseUtil;

public class AutoPracticeTest extends TestBaseUtil{
	WebDriverWait wait;

	@Test(alwaysRun = true)
	public void launchApp() {
		lanuchApplication("http://automationpractice.com/index.php");

	}

	@Test(dependsOnMethods =  "launchApp")
	@Parameters({"username","password"})
	public void loginToAutoPract(String username,String password) throws InterruptedException {
		//click on Signin button
		driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#email")));
		System.out.println("username from xml -->"+username);
		System.out.println("password from xml -->"+password);
		driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#passwd")).sendKeys(password);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='SubmitLogin'] span")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")));
		
		driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")).click();
		
	}

	@Test(dependsOnMethods =  "loginToAutoPract")
	public void logoutAutoPract() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Log me out']")));
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#email")));

	}
	
	@AfterClass
	public void closeMyBrowser() {
		closeBrowser();
	}

}
