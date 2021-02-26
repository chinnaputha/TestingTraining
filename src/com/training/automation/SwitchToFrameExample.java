package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Class to perform frame handleling
 * 
 * @author Chinna.Putha
 *
 */
public class SwitchToFrameExample extends TestBaseUtil {

	public static void switchToFrame() throws InterruptedException {
		lanuchApplication("http://demo.automationtesting.in/Frames.html");
		// driver.switchTo().frame(0);// switching to iframe using index position
		// driver.switchTo().frame("SingleFrame");// switching to iframe using name
		// attribute value

		WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frameEle);// switching to iframe using WebElement

		/*
		 * String pageSourceFrame = driver.getPageSource();
		 * System.out.println("page source -->" + pageSourceFrame);
		 */

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("frametest");
		
		driver.switchTo().defaultContent();//move out from iframe

		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(4000);

		closeBrowser();
	}

	public static void main(String[] args) throws InterruptedException {
		switchToFrame();

	}

}
