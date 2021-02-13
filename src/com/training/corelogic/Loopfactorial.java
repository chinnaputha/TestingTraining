package com.training.corelogic;

/**
 * Class to perform factorical program
 * @author Vishnu
 *
 */
public class Loopfactorial {
	
	/**
	 * Method for factorical program
	 */
	public static void factorical() {
		int i, fact = 1;
		int number = 5;
		for (i = 1; i <= 5; i++) {
			fact = fact * i;

			System.out.println("Factorial of " + number + " is: " + fact);
		}
	}

	public static void main(String[] args) {
		Loopfactorial.factorical();
	}
}
