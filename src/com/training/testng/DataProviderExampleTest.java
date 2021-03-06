package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.automation.TestBaseUtil;

public class DataProviderExampleTest extends TestBaseUtil{
	WebDriverWait wait;

	@Test(dataProvider = "getData")
	public void loginToAutoPract(String username,String password) throws InterruptedException {
		lanuchApplication("http://automationpractice.com/index.php");
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
		
		WebElement loginEle = driver.findElement(By.cssSelector("button[id='SubmitLogin'] span"));
		//loginEle.click();
		
		String pageTitle= jse.executeScript("return document.title;").toString();
	
		System.out.println("page title -->"+pageTitle);
		Assert.assertEquals(pageTitle, "Login - My Store");
		
		jse.executeScript("arguments[0].click();", loginEle);
		
		String errMsg = driver.findElement(By.cssSelector("div[class*='alert-danger'] p")).getText();
		String errMsg2 = driver.findElement(By.cssSelector("div[class*='alert-danger'] li")).getText();
		
		System.out.println("Error msg1 "+errMsg+" Error Msg 2 -->"+errMsg2);
		
		Assert.assertEquals(errMsg, "There is 1 error");
		Assert.assertEquals(errMsg2, "Authentication failed.","application not displaying expected error msg");
		
	}

	@DataProvider
	Object[][] getData(){
		Object[][] ob = new Object[2][2];
		ob[0][0]="javacsdfasdfsdampus.selenium@gmail.com";
		ob[0][1]="Testing@123";
		
		ob[1][0]="abdtestrd@gmail.com";
		ob[1][1]="sfsdfsa";
		
		return ob;
	}
	
	
	@AfterClass
	public void closeMyBrowser() {
		driver.quit();
	}

}
