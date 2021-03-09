package com.training.exception;

import java.util.Scanner;

/**
 * Class to perform exception handling with multiple catch blocks
 * 
 * @author Chinna.Putha
 *
 */
public class ThrowThrowsExample {

	public static void main(String[] args) throws Exception  {
		int a, b;
		int ans = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");

		a = s.nextInt();
		b = s.nextInt();

		if(b == 0) {
			throw new Exception("Denominator should not be zero");
		}

	}

}
