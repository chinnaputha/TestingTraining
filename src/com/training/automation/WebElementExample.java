package com.training.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementExample extends TestBaseUtil {

	public static void main(String[] args) throws InterruptedException {
		lanuchApplication("http://demo.automationtesting.in/Register.html");
		
		WebElement firtName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firtName.sendKeys("first name enter");
		//driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("java");
		
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("java");
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).clear();
		Thread.sleep(4000);
		
		
		boolean isRadioSelected = driver.findElement(By.cssSelector("input[value='FeMale']")).isSelected();
		System.out.println(" Radio  button status before click "+isRadioSelected);//Radio  button status false
		
		/*
		 * if(isRadioSelected == false) {
		 * System.out.println("radio button not selected ");
		 * driver.findElement(By.name("radiooptions")).click(); }
		 */
		
		if(!isRadioSelected) {
			driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		}
		
		isRadioSelected = driver.findElement(By.cssSelector("input[value='FeMale']")).isSelected();
		System.out.println(" Radio  button status after click "+isRadioSelected);//Radio  button status true
		
		
		List<WebElement> radioList = driver.findElements(By.name("radiooptions"));
		System.out.println("Total radio buttons -->"+radioList.size());
		
		
		for(WebElement ele:radioList) {
			System.out.println("webelements -->"+ele);
		}
		
		
		//driver.findElement(By.cssSelector("a[class='link facebook']")).click();
	
		Thread.sleep(4000);
		
		String titleOfthePage = driver.getTitle();
		System.out.println("page title -->"+titleOfthePage);
		
		driver.quit();
	

	}

}
