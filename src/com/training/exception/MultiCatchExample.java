package com.training.exception;

import java.util.Scanner;

/**
 * Class to perform exception handling with multiple catch blocks
 * @author Chinna.Putha
 *
 */
public class MultiCatchExample {

	public static void main(String[] args) {
		String a,b;
		int ans=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		a=s.next();
		b=s.next();
		
		try {
			ans= Integer.parseInt(a)/Integer.parseInt(b);
		}catch (ArithmeticException ae) {
			System.out.println("Denominator should not be zero");
			ae.printStackTrace();
		}catch (NumberFormatException nfe) {
			System.out.println("Enter numbers only");
			nfe.printStackTrace();
		}catch (Exception e) {
			System.out.println("Exception occred");
			e.printStackTrace();
		} 
	}

}
