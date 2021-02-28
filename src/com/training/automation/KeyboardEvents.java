package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Class to perform actions class operations(Keyboard and mouse events)
 * 
 * @author Chinna.Putha
 *
 */
public class KeyboardEvents extends TestBaseUtil {

	/**
	 * Method to perform keyboard events
	 * @throws InterruptedException
	 */
	public void keyboardEvents() throws InterruptedException {
		lanuchApplication("http://demo.automationtesting.in/Register.html");

		WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Actions act = new Actions(driver);
		String firsname=" helloseleniumjava";
		act.keyDown(Keys.SHIFT);//pressing shift key in keyboard
		act.sendKeys(firstName, firsname);
		act.keyUp(Keys.SHIFT);//shift key will be released
		act.build().perform();
		
		Thread.sleep(4000);
		
		
		WebElement address= driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("asdfasdfasdfasdfffffffffffffffffffffffasfasdfsdfasdfasdafasdfasdfasdfsd");
		Thread.sleep(4000);
	
		//address.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		
		//alternate way for multiple keys
		String selectAllDelete = Keys.chord(Keys.CONTROL,"a",Keys.DELETE);
		address.sendKeys(selectAllDelete);
		
		//address.clear(); 
		
		Thread.sleep(4000);
		
		
		
		closeBrowser();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		KeyboardEvents ace = new KeyboardEvents();
		ace.keyboardEvents();
	}

}
