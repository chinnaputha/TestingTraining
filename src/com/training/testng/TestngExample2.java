package com.training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Class to use various testng annotataions
 * @author Chinna.Putha
 *
 */
public class TestngExample2 {
	
	/*
	 * @BeforeTest public void beforeTest() {
	 * System.out.println(" Before Test aaa"); }
	 * 
	 * @AfterTest public void afterTest() { System.out.println(" After Test aaa"); }
	 */
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" Before Class aaa");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" After Class aaa");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Before Method aaa");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" After Method aaaa");
	}
	
	@Test
	public void method1() {
		System.out.println(" Method1 aaaa");
	}
	
	@Test
	public void method2() {
		System.out.println(" Method2 aaa");
	}
	
}
