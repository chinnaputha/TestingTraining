package com.training.exception;

public class ExceptionExample {
	
	public void test() throws Exception  {
		Thread.sleep(4000);
	}

	public static void main(String[] args) throws Exception {
		ExceptionExample ee = new ExceptionExample();
		ee.test();

	}

}
