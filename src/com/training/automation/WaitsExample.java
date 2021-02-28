package com.training.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Class to perform implicit wait and explicit wait
 * 
 * @author Chinna.Putha
 *
 */
public class WaitsExample  {

	WebDriver driver;
	public void impExpWait() {
		// set the chromedriver.exe path to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// driver
		// open the chrome browser

		driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		// open the application url in browser
		driver.get("http://demo.automationtesting.in/Modals.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='#myModal']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save changes']")));
	
		driver.findElement(By.xpath("//button[normalize-space()='Save changes']")).click();
		
		
		driver.findElement(By.xpath("//a[@href='#myModalMulti']")).click();
	}

	public static void main(String[] args) {
		WaitsExample we = new WaitsExample();
		we.impExpWait();

	}

}
