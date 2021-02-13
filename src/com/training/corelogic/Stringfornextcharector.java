package com.training.corelogic;

/**
 * Class to perform String next character
 * @author Ravindra
 *
 */
public class Stringfornextcharector {
	
	/**
	 * Method for string next char program
	 */
	public void stringfornextcharector(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ch++;
			System.out.print(ch);
		}
		System.out.println("**************");
	}

	public static void main(String[] args) {
		Stringfornextcharector strn = new Stringfornextcharector();
		strn.stringfornextcharector("Ashok");
		strn.stringfornextcharector("Hello");

	}
}
