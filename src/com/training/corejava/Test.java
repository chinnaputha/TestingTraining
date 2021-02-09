package com.training.corejava;

/**
 * Class for constructor Example
 * 
 * @author Chinna.Putha
 *
 */
public class Test {

	int a = 10;
	int b = 20;

	Test() {
		System.out.println("Im in Default constructor");
		int c = a + b;
		System.out.println("C value" + c);
	}

	Test(int a, int b) {
		System.out.println("Im in parameterized constructor");
		int c = a + b;
		System.out.println("C value" + c);
	}

	Test(String str) {
		System.out.println("String value -->" + str);
	}

	Test(String str, float f, double d, long l) {
		System.out.println("String value -->" + str);
	}

	public void testM() {
		System.out.println("Test.testM()");
	}

	public static void main(String[] args) {

		Test t = new Test();
		Test t2 = new Test(40, 50);
		Test t3 = new Test("Hello");

		Test t4;
		t4 = new Test();
		t4 = new Test(23, 45);
		t4 = new Test("Hello");

	}

}
