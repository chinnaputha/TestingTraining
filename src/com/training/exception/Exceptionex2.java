package com.training.exception;

public class Exceptionex2 {
	
	public static void main(String[] args) throws Exception {
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
		} catch (Exception e) {
			throw new Exception("Denominator should not be zero");
			
		}finally {
			
		}
	}

}
