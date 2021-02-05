package com.training.corejava;

/**
 * Class to perform unary opearations
 * 
 * @author Chinna.Putha
 *
 */

//shortcut to format the code -- Ctrl+Alt+F
//to know all shortcuts in eclipse -- Ctrl + Shift +F
public class UnaryOperators {

	/**
	 * method to perform pre/post increment/decrement
	 */
	public void unaryOp() {
		int age = 18;

		System.out.println("Age 1-->" + (++age));// 19 -- Pre increment
		System.out.println("current age is -->" + age);// 19

		int updatedAge = age;
		System.out.println("updaged age-->" + updatedAge);

		System.out.println("Age 2-->" + (age++));// 19 -- Post increment
		System.out.println("current age is 2 -->" + age);// 20

		System.out.println(" Age 3--->" + (--age));// 19 --- pre decrement
		System.out.println("current age is3 -->" + age);// 19
		System.out.println("Age4--->" + (age--));// 19 -- post decrement
		System.out.println("current age is4 -->" + age);// 18

	}

	public static void main(String[] args) {
		UnaryOperators uo = new UnaryOperators();
		uo.unaryOp();

	}

}
