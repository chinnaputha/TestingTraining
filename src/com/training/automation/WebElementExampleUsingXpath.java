package com.training.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementExampleUsingXpath extends TestBaseUtil {

	public static void main(String[] args) throws InterruptedException {
		lanuchApplication("http://demo.automationtesting.in/Register.html");
		
		WebElement firtName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firtName.sendKeys("first name enter");
		//driver.findElement(By.xpath("input[placeholder='First Name']")).sendKeys("java");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("last name");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		Thread.sleep(4000);
		
		//find how many checkboxes in a web page (DOM)
		
		
		List<WebElement> totalCheckboxes  = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkboxes size-->"+totalCheckboxes.size());
		
		//select all checkboxes
		for(WebElement chkBox:totalCheckboxes) {
			chkBox.click();
			Thread.sleep(2000);
		}
		
		//checking whether checkboxs are checked or not
//		boolean chbBox1  = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
//		boolean chbBox2  = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
//		boolean chbBox3  = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected();
//		
//		if(chbBox1&&chbBox2&&chbBox3) {
//			System.out.println(" All checkboxes are checked");
//		} else {
//			System.out.println(" All check boxes are not checked");
//		}
//		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement ele: checkboxes) {
			if(ele.isSelected()) {
				System.out.println("checkbox checked");
			}
		}
		
		driver.close();

	}
	
	

}
