package com.training.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Class to perform actions class operations(Keyboard and mouse events)
 * 
 * @author Chinna.Putha
 *
 */
public class DragandDropExample extends TestBaseUtil {

	public void mouseOprations() throws InterruptedException {
		lanuchApplication("https://demoqa.com/droppable/");

		Actions act = new Actions(driver);

		WebElement srcEle = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement targetEle = driver.findElement(By.cssSelector("div[id='droppable']"));

		act.dragAndDrop(srcEle, targetEle).build().perform();// drag and drop

		Thread.sleep(2000);

		
		//WebElement toc = driver.findElement(By.cssSelector("a#droppableExample-tab-accept"));
		
		//act.click(toc).build().perform();
		//Thread.sleep(4000);
		
//		WebElement srcEle = driver.findElement(By.xpath("//div[@id='acceptable']"));
//		WebElement targetEle = driver.findElement(By.xpath("//div[@id='droppable']"));
//
//		act.dragAndDrop(srcEle, targetEle).build().perform();// drag and drop
		

	}

	public static void main(String[] args) throws InterruptedException {
		DragandDropExample ace = new DragandDropExample();
		ace.mouseOprations();
	}

}
