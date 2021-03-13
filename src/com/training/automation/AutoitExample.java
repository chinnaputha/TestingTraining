package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Class to perform File upload using Autoit
 * 
 * @author Chinna.Putha
 *
 */
public class AutoitExample extends TestBaseUtil {

	@org.testng.annotations.Test
	public void fileUpload() throws Exception {
		try {
			lanuchApplication("http://demo.automationtesting.in/FileUpload.html");

//			WebDriverWait wait = new WebDriverWait(driver, 5);
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='file']")));

			// driver.findElement(By.xpath("//input[@type='file']")).click();
			WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
			Actions act = new Actions(driver);
			act.click(ele).build().perform();

			// integrate my autoit code here

			Runtime.getRuntime().exec("autoit\\fileUp3.exe");

			
			//Fileupload without Autoit is possible when input type = file,
			//ele.sendKeys("C:\\Users\\Chinna.Putha\\eclipse-workspace\\TestingTraining\\screenshots\\image_2_28_2021_8_32_40.png");

		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(8000);

		closeBrowser();

	}

}
