package com.training.automation;

import java.util.Set;

import org.openqa.selenium.By;

/**
 * Class to perform window handle
 * 
 * @author Chinna.Putha
 *
 */
public class WindowHandleTest extends TestBaseUtil {

	public void windhowHandle() throws Exception {
		lanuchApplication("http://demo.automationtesting.in/Windows.html");

		// refresh web page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String parent_window = driver.getWindowHandle();
		System.out.println("Parent window id -->"+parent_window);//abc123
		
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Thread.sleep(2000);
		Set<String> totalWindows = driver.getWindowHandles();
		System.out.println("Total windows -->"+totalWindows.size());//2
		
		for(String childWindow:totalWindows) {
			System.out.println("window ids-->"+childWindow);//abc124
			if(!childWindow.equals(parent_window)) { //abc124 equals abc123
				driver.switchTo().window(childWindow);//now control is moving from parent to child window
				driver.findElement(By.cssSelector("input[name='search']")).sendKeys("javaTest");
				driver.close();//closing child window
				
			}
			
		}
		
		System.out.println(10+20+"success");
		
		Thread.sleep(2000);
		
		//now move the control from child to parent or switch back to parent window
		driver.switchTo().window(parent_window);
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		
		
		driver.close();//closing parent window
	}

	public static void main(String[] args) throws Exception {
		WindowHandleTest wht = new WindowHandleTest();
		wht.windhowHandle();
	}

}
