package com.training.testng;

import org.testng.annotations.Test;
/**
 * Class for testng priority attribute
 * @author Chinna.Putha
 *
 */
public class TestngAnnotationAttributesExample2 {
	
	@Test(priority = 2)
	public void amethod4() {
		System.out.println("TestngAnnotationAttributesExample.method4()");
	}
	
	@Test(priority = 1)
	public void dmethod1() {
		System.out.println("TestngAnnotationAttributesExample.method1()");
	}
	
	@Test(priority = 0)
	public void cmethod2() {
		System.out.println("TestngAnnotationAttributesExample.method2()");
	}
	
	@Test(priority = 3)
	public void bmethod3() {
		System.out.println("TestngAnnotationAttributesExample.method3()");
	}
	

}
