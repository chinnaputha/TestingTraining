package com.training.automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Class to perform get all country options using getOptions()
 * 
 * @author Chinna.Putha
 *
 */
public class SelectExample2 extends TestBaseUtil {

	public void performDropdownOprations() throws Exception {
		lanuchApplication("http://demo.automationtesting.in/Register.html");

		// refresh web page
		driver.navigate().refresh();
		Thread.sleep(2000);

		WebElement sesElement = driver.findElement(By.xpath("//select[@id='countries']"));
		Select ses = new Select(sesElement);

		List<WebElement> countryOptions = ses.getOptions();
		System.out.println("How many countries -->" + countryOptions.size());

		// ses.selectByVisibleText("Trinidad and Tobago");

//		for (WebElement co : countryOptions) {
//
//			System.out.println("country name -->" + co.getText());
//			String countryName = co.getText();
//			if (countryName.contains("Grenadines")) {
//				co.click();
//			}
//		}

		// find country name among multiple countries
		for (WebElement co : countryOptions) {
			System.out.println("country name -->" + co.getText());
			if (co.getText().equals("Thailand")) {
				System.out.println("Thailand Country available in country dropdown list");
				break;
			}
		}

		List<String> al = new ArrayList<String>();
		// find country name among multiple countries
		for (WebElement co : countryOptions) {
			al.add(co.getText());
		}
		System.out.println("country check using list -->"+al);
		System.out.println("country check using list -->"+al.contains("India"));

		Thread.sleep(4000);

		driver.close();

	}

	public static void main(String[] args) throws Exception {
		SelectExample2 se = new SelectExample2();
		se.performDropdownOprations();
	}

}
