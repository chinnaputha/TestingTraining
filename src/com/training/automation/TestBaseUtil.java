package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseUtil {

	static WebDriver driver;
	
	public static  void lanuchApplication(String appURL) {

		// set the chromedriver.exe path to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// driver
		// open the chrome browser

		driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		// open the application url in browser
		driver.get(appURL);
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
