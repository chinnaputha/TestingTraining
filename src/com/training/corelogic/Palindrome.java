package com.training.corelogic;

import java.util.Scanner;

/**
 * 
 * Class to perform given number is palindrome or not?
 *
 * @author Pavan
 * 
 */
public class Palindrome {
	

	// Variables declaration

	int reverseNumber, temporaryVariable;

	/* Method to perform given number is palindrome or not? */

	// create an object of Scanner class

	Scanner input = new Scanner(System.in);
	// takes integer input values from the keyboard
	int originalInteger = input.nextInt();

	public void palindrome() {
		// input value assign to temporary variable

		temporaryVariable = originalInteger;

		// using while performing reverse number logic

		while (temporaryVariable != 0) {

			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + temporaryVariable % 10;
			temporaryVariable = temporaryVariable / 10;

		}
		//using if
		if (originalInteger == reverseNumber) {
			System.out.println(originalInteger+ "-->is palindrome");
		//using else
		} else {
			System.out.println(originalInteger+ "-->is not palindrome");
		}
	}

	public static void main(String[] args) {
		// Create an object of Palindrome class

		Palindrome p = new Palindrome();

		// calling palindrome method by using object reference

		p.palindrome();
	}

}
