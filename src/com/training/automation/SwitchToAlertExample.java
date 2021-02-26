package com.training.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/**
 * Class to perform Alert handleling
 * 
 * @author Chinna.Putha
 *
 */
public class SwitchToAlertExample extends TestBaseUtil {

	public static void switchToFrame() throws InterruptedException {
		lanuchApplication("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.linkText("Alert with Textbox")).click();
		
		driver.findElement(By.cssSelector("div[id='Textbox'] button")).click();//parent to child using cssSelector
		//driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();//parent to child using xpath
		
		//switch to alert
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.sendKeys("Hello alert");// enter value using alert sendkeys method
		Thread.sleep(2000);
		String alrtText = alrt.getText();//get alert text
		System.out.println("Alert text -->"+alrtText);
		//alrt.accept();//click Ok button of alert
		alrt.dismiss();//click cancel button of alert
	
		Thread.sleep(4000);

		closeBrowser();
	}

	public static void main(String[] args) throws InterruptedException {
		switchToFrame();

	}

}
