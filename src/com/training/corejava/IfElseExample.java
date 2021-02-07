package com.training.corejava;

/**
 * Class to perform if else control flow statements
 * 
 * @author Chinna.Putha
 *
 */
public class IfElseExample {

	public static void ifElseEx() { //static method

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
	public void ifElseIf() { //instance method

		int marks = 80;
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
	
	/**
	 * Method to perform operations using switch statment
	 */
	//shortcut to uppercase letters - Ctrl+shift+X
	//shortcut to lowercase letters - Ctrl+shift+Y
	public void switchExample(int month) {
		
		switch(month) {
		case 1:
			System.out.println("JANUARY");
			break;
			
		case 2:
			System.out.println("FEBRUARY");
			break;
			
		case 3:
			System.out.println("MARCH");
			break;
			
		case 4:
			System.out.println("APRIL");
			break;
			
		case 5:
			System.out.println("MAY");
			break;
		case 6:
			System.out.println("JUNE");
			break;
		
		default:
			System.out.println("invalid month");
		}
		
	}
	
	

	public static void main(String[] args) {
		IfElseExample iee = new IfElseExample();
		//IfElseExample.ifElseEx();
		iee.ifElseIf();
		
		iee.switchExample(1);

	}

}
