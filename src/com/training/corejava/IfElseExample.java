package com.training.corejava;

/**
 * Class to perform if else control flow statements
 * 
 * @author Chinna.Putha
 *
 */
public class IfElseExample {

	public static void ifElseEx() {

		int age = 18;

		// using if
		if (age >= 18) {
			System.out.println("Eligible for vote");
		}

		// using if else
		int number = 12;
		if (number % 2 == 0) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is Odd");
		}
	}

	/**
	 * Method to perform if else if operations
	 */
	public void ifElseIf() {

		int marks = 20;
		if (marks >= 60) {
			System.out.println(" First Class");
		} else if (marks >= 50 && marks < 60) {
			System.out.println(" Second Class");
		} else if (marks >= 35 && marks < 50) {
			System.out.println("Third class");
		} else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) {
		IfElseExample iee = new IfElseExample();
		//IfElseExample.ifElseEx();
		iee.ifElseIf();

	}

}
