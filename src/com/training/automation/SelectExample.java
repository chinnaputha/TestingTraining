package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Class to perform dropdown operations using Select classs
 * 
 * @author Chinna.Putha
 *
 */
public class SelectExample extends TestBaseUtil {

	public void performDropdownOprations() throws Exception {
		lanuchApplication("http://demo.automationtesting.in/Register.html");

		Thread.sleep(4000);

		driver.navigate().refresh();

		Thread.sleep(2000);
		
		driver.navigate().refresh();

		Thread.sleep(2000);

		WebElement sesElement = driver.findElement(By.xpath("//select[@id='countries']"));
		Select ses = new Select(sesElement);

		// select by index
		/*
		 * ses.selectByIndex(15);// Austria Thread.sleep(4000);
		 */

		// select by option tag value
		/*
		 * ses.selectByValue("China"); Thread.sleep(4000);
		 */

		// select by text
		ses.selectByVisibleText("India");
		Thread.sleep(4000);
		
		//gives selected dropdown option/value
		WebElement selectedEle = ses.getFirstSelectedOption();
		System.out.println("Selected option/value from dropdown -->"+selectedEle.getText());
		
		if(selectedEle.getText().equals("India")) {
			System.out.println("Selected value is correct");
		}else {
			System.out.println("Selected value is not correct");
		}
		
		
		Thread.sleep(4000);
		
		driver.close();

	}

	public static void main(String[] args) throws Exception {
		SelectExample se = new SelectExample();
		se.performDropdownOprations();
	}

}
