package com.training.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Class to perform Google page automation
 * @author Chinna.Putha
 *
 */
public class GoogleTestAutomationFirefox {

	public static void main(String[] args) throws InterruptedException {
		//set the chromedriver.exe path to launch chrome browser
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");//driver
		//open the firefox browser
		WebDriver driver = new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
		//open the application url in browser
		driver.get("http://google.com/");
		
		//driver.navigate().to("http://google.com/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		
		String pageCurrentURL= driver.getCurrentUrl();
		System.out.println("Current url -->"+pageCurrentURL);
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title -->"+pageTitle);
		
		if(pageTitle.equals("Google")) {
			System.out.println("Page title validation succesful");
		} else {
			System.out.println("Page title have an issue - showing different title");
		}
		
		String pageSource = driver.getPageSource();
		System.out.println(" page source --->"+pageSource);
		
		driver.navigate().back();
		Thread.sleep(4000); //1000 ms -- 1sec
		
		
		//close the browser
		//driver.close();
		driver.quit();
	}
	

}
