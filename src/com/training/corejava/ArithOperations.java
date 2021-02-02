package com.training.corejava;

/**
 * 
 * Class to perform Arithmetic operations
 * @author Chinna.Putha
 *
 */

//Alt+Shift+J = shortcut for java doc
public class ArithOperations {
	
	/**
	 * Method to perform arithmetic operations
	 */
	public void arithTest() {
		int a=8,b=4;
		System.out.println("a+b  --->"+(a+b));
		System.out.println("a-b  --->"+(a-b));
		System.out.println("a*b  --->"+(a*b));
		System.out.println("a/b  --->"+(a/b));
		System.out.println("a%b  --->"+(a%b));
	}
	
	public void arithTest2() {
		int a=8,b=4;
		System.out.println("a+b  --->"+(a+b));
		System.out.println("a-b  --->"+(a-b));
		System.out.println("a*b  --->"+(a*b));
		System.out.println("a/b  --->"+(a/b));
		System.out.println("a%b  --->"+(a%b));
	}
	
	
	public static void main(String[] args) {
		
		//Object creation
		ArithOperations ao = new ArithOperations();
		ao.arithTest();//call the method using object name i.e. ao
		ao.arithTest2();//call the method using object name i.e. ao
		
		
	}

}
