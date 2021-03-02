package com.training.testng;

import org.testng.annotations.Test;

/**
 * Class to execute method  using TestNG
 * @author Chinna.Putha
 *
 */
public class TestSample {
	
	
	@Test
	public void method1() {
		System.out.println("Method1 to print");
	}
	
	@Test
	public void method2() {
		System.out.println("Method2 to print"+(10/0));
	}

}
