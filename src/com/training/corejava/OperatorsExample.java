package com.training.corejava;

public class OperatorsExample {

	/**
	 * Method to perform arithmetic operations
	 */
	public void arithmeticOperations() {
		System.out.println("**********Arithmetic Operations***********");
		int a = 8, b = 4;
		System.out.println("a+b  --->" + (a + b));
		System.out.println("a-b  --->" + (a - b));
		System.out.println("a*b  --->" + (a * b));
		System.out.println("a/b  --->" + (a / b));
		System.out.println("a%b  --->" + (a % b));
	}

	/**
	 * Method to perform assignment operations
	 */
	public void assignmentOperations() {
		System.out.println("**********Assignment Operations***********");
		int a = 8, b = 4;
		System.out.println("a+=b or a=a+b -->" + (a += b)); // 8+4 -->a=12
		System.out.println("a-=3 or a=a-3 -->" + (a -= 3)); // 12-3 -->a=9
		System.out.println("a*=7 or a=a*7 -->" + (a *= 7)); // 9*7 -->a=63
		System.out.println("a/=b or a=a/b -->" + (a /= b)); // 63/4 -->a=15
		System.out.println("a%=5 or a=a%5 -->" + (a %= 5)); // 15%5 -->a=0
	}

	/**
	 * method to perform logical operations
	 */
	public void logicalOperators() {
		System.out.println("**********Logical Operations***********");
		int a = 8, b = 4, c = -10;

		System.out.println("(a<b) && (b>c) --->" + ((a < b) && (b > c)));// false
		// 8<4&&4>-10
		// F&&T -- F

		System.out.println("(b!=-c) || (a==b) --->" + ((b != -c) || (a == b)));// True
		// 4!=10||8==4
		// T||F

		System.out.println("!(b<=-a) --->" + !(b <= -a));// true
		// !(4<=-8)
		// !F -- True

	}

	/**
	 * Method to perform relations operations
	 */
	public void relationalOperators() {
		System.out.println("**********Relational Operations***********");
		int a = 8, b = 4;
		System.out.println("a<b  --->" + (a < b)); // false
		System.out.println("a<=10  --->" + (a <= 10));// true
		System.out.println("a>b  --->" + (a > b));// true
		System.out.println("a>=10  --->" + (a >= 10));// false
		System.out.println("a==b  --->" + (a == b));// false
		System.out.println("a!=(-4)  --->" + (a != (-4)));// true
	}

	/**
	 * Method to perform ternary operations
	 */
	public void ternaryOperators() {
		System.out.println("**********Ternary Operations***********");
		int a, b;

		a = 10;

		b = (a == 1) ? 30 : 20;
		System.out.println("b value " + b);// 20

		b = (a == 10) ? 30 : 20;
		System.out.println("b value " + b);// 30

		int age = 15;

		String output = (age >= 18) ? "Eligle for vote" : "Not Eligile for vote";
		System.out.println("Final value -->" + output);

	}

	/**
	 * method to perform pre/post increment/decrement
	 */
	public void unaryOp() {
		System.out.println("**********Unary Operations***********");
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

	public void callAllMethods() {
		arithmeticOperations();
		assignmentOperations();
		logicalOperators();
		relationalOperators();
		ternaryOperators();
		unaryOp();
	}

	public static void main(String[] args) {
		OperatorsExample oe = new OperatorsExample();

		oe.arithmeticOperations();
		oe.assignmentOperations();
		oe.logicalOperators();
		oe.relationalOperators();
		oe.ternaryOperators();
		oe.unaryOp();

		//to call all methods from one method
		oe.callAllMethods();

	}

}
