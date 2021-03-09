package com.training.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=10,b=5;
		try {
			int c=a/b;
		} 
		catch (Exception e) {
			System.out.println("Demoninator should not be a zero");
		} finally {
			System.out.println("Im in finally block");
		}
		System.out.println("program executon completed");
		System.out.println("afasdfas");
				

	}

}
