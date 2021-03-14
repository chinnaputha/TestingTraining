package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucelabsExampleTest extends TestBaseUtil{
	
	WebDriverWait wait;
	
	/**
	 * Open Application in Saucelabs
	 */
	@Test
	public void openAppinSaucelabs()throws Exception{
		runOnSauceLabsFromLocal("Mac", "Chrome");
		lanuchApplication("http://automationpractice.com/index.php");
		//click on Signin button
		driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#email")));
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("javacampus.selenium@gmail.com");
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("Testing@123");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='SubmitLogin'] span")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")));
		
		WebElement loginEle = driver.findElement(By.cssSelector("button[id='SubmitLogin'] span"));
		//loginEle.click();
		
		String pageTitle= jse.executeScript("return document.title;").toString();
	
		System.out.println("page title -->"+pageTitle);
		Assert.assertEquals(pageTitle, "Login - My Store");
		
		jse.executeScript("arguments[0].click();", loginEle);
		
		driver.close();
		
	}
	
	

}
