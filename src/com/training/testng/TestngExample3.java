package com.training.testng;

import org.testng.annotations.Test;
/**
 * Class for testng enabled and invocation count attributes
 * @author Chinna.Putha
 *
 */
public class TestngExample3 {
	
	  @Test public void launchBrowser() {
	  System.out.println("open browser and hit the url"); }
	  
	  @Test public void login() { System.out.println("login to application"); }
	  
	  @Test(enabled= false) public void composeEmail() {
	  System.out.println("compose an email"); }
	  
	  @Test public void logout() {
	  System.out.println("logout from the application"); }
	 
	
	
	@Test(invocationCount = 10)
	public void method4() {
		System.out.println("login using same valid credentials");
		System.out.println("logout from the application");
	}
	
	
	

}
