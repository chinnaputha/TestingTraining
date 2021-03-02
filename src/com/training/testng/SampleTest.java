package com.training.testng;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void sample() {
		System.out.println("SampleTest.sample()");
	}
	
	@Test
	public void sample2() {
		System.out.println("SampleTest.enclosing_method()");
	}

}
