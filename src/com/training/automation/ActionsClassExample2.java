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
public class ActionsClassExample2 extends TestBaseUtil {

	public void mouseOprations() throws InterruptedException {
		lanuchApplication("http://demo.automationtesting.in/Register.html");

		// driver.findElement(By.linkText("Interactions"))

		WebElement ele = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();//mousehover on Interactions

		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		act.moveToElement(ele2).build().perform();//mouserhover on drag and drop
		
		WebElement staticEle = driver.findElement(By.xpath("//a[text()='Static ']"));
		
		
		//act.contextClick(staticEle).build().perform();//Right click on Static link
		staticEle.click();
		Thread.sleep(4000);
		
		/*
		 * WebElement srcEle =
		 * driver.findElement(By.cssSelector("div[id='dragarea'] img[id='angular']"));
		 * WebElement targetEle = driver.findElement(By.xpath("//div[@id='droparea']"));
		 * 
		 * act.dragAndDrop(srcEle, targetEle).build().perform();//drag and drop
		 */		
		
		
		
		Thread.sleep(4000);
		
		closeBrowser();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		ActionsClassExample2 ace = new ActionsClassExample2();
		ace.mouseOprations();
	}

}
