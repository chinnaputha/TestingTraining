package com.training.corejava;

/**
 * 
 * Class to perform Arithmetic operations
 * @author Chinna.Putha
 *
 */

//Alt+Shift+J = shortcut for java doc
public class ArithmeticOperators {
	
	/**
	 * Method to perform arithmetic operations
	 */
	public void arithmeticOperations() {
		int a=8,b=4;
		System.out.println("a+b  --->"+(a+b));
		System.out.println("a-b  --->"+(a-b));
		System.out.println("a*b  --->"+(a*b));
		System.out.println("a/b  --->"+(a/b));
		System.out.println("a%b  --->"+(a%b));
	}
	
	
	public static void main(String[] args) {
		
		//<class name> objectname = new <classname>();
		ArithmeticOperators arith = new ArithmeticOperators();
		arith.arithmeticOperations();
		
		
		
	}

}
