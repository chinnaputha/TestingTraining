package com.training.testng;

import org.testng.annotations.Test;
/**
 * Class for testng priority attribute
 * @author Chinna.Putha
 *
 */
public class TestngAnnotationAttributesExample {
	
	
	@Test(alwaysRun = true)
	public void launchBrowser() {
		System.out.println("open browser and hit the url");
	}
	
	@Test(dependsOnMethods = "launchBrowser")
	public void login() {
		int c= 10/0;
		System.out.println("login to application");
	}
	
	@Test(dependsOnMethods = "login")
	public void composeEmail() {
		System.out.println("compose an email");
	}
	
	@Test(dependsOnMethods = "composeEmail")
	public void logout() {
		System.out.println("logout from the application");
	}
	
	
	

}
