package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.automation.TestBaseUtil;
import com.training.objectmap.IAutoPractObjMap;

public class AutoPracticeTest extends TestBaseUtil{
	WebDriverWait wait;

	@Test(alwaysRun = true)
	@Parameters({"appURL"})
	public void launchApp(String appURL) {
		lanuchApplication(appURL);

	}

	@Test(dependsOnMethods =  "launchApp")
	@Parameters({"username","password"})
	public void loginToAutoPract(String username,String password) throws InterruptedException {
		//click on Signin button
		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_SIGNIN_CSS)).click();
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(IAutoPractObjMap.AP_USERNAME_CSS)));
		System.out.println("username from xml -->"+username);
		System.out.println("password from xml -->"+password);
		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_USERNAME_CSS)).sendKeys(username);
		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_PASSWORD_CSS)).sendKeys(password);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(IAutoPractObjMap.AP_LOGIN_CSS)));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector(IAutoPractObjMap.AP_LOGIN_CSS)));
		
		driver.findElement(By.cssSelector(IAutoPractObjMap.AP_LOGIN_CSS)).click();
		
	}

	@Test(dependsOnMethods =  "loginToAutoPract")
	public void logoutAutoPract() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IAutoPractObjMap.AP_LOGOUT_XPATH)));
		driver.findElement(By.xpath(IAutoPractObjMap.AP_LOGOUT_XPATH)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(IAutoPractObjMap.AP_USERNAME_CSS)));

	}
	
	@AfterClass
	public void closeMyBrowser() {
		closeBrowser();
	}

}
