package com.training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Class to use various testng annotataions
 * @author Chinna.Putha
 *
 */

@Test(groups = "Regression")
public class TestngExample {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println(" After Suite");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println(" Before Test");
	}
	
	@AfterTest
	public void asfsfs() {
		System.out.println(" After Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" After Method");
	}
	
	@Test
	public void method1() {
		System.out.println(" Method1");
	}
	
	@Test
	public void method2() {
		System.out.println(" Method2");
	}
	
}
