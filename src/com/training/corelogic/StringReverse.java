package com.training.corelogic;

/**
 * Class to perform string reverse using built in method and without built in
 * method
 * 
 * @author Maaz
 *
 */
public class StringReverse {

	/**
	 * Method for String reverse using built in method i.e reverse()
	 * 
	 * @param str
	 */
	public static void stringReverseWithBuilt(String str) {
		StringBuffer sbr = new StringBuffer(str);
		// Reversing the string
		sbr.reverse();
		System.out.println("Reverse of string using built-->" + sbr);
	}

	/**
	 * Method for String reverse without built in method i.e reverse()
	 * 
	 * @param str
	 */
	public static void stringReverseWithOutBuilt(String str) {
		String revString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}

		System.out.println("reverse string with custom logic-->" + revString);
	}

	public static void main(String[] args) {
		StringReverse.stringReverseWithBuilt("Selenium");
		StringReverse.stringReverseWithOutBuilt("Selenium");

	}

}
