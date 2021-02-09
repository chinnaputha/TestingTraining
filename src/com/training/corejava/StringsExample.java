package com.training.corejava;

public class StringsExample {
	
	
	
	static String str ="JavaSelenium";
	static String str2= new String("JavaSelenium");

	
	public static void main(String[] args) {
		System.out.println("String equals -->"+str.equals(str2));//true
		System.out.println("String == -->"+(str==str2));//false

	}

}
