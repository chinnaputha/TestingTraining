package com.training.corejava;

public class InstanceStaticExample  {

	int a = 10; // instance variable
	static String str = "Hello"; // static variable

	// instance method or non-static method
	public void method1() {
		int a = 20;// local variable
		System.out.println("A value-->" + a);

	}

	// static method
	public static void method2() {
		System.out.println("InstanceStaticExample.method2()");
	}

	// non-static method
	public void method3() {
		
		System.out.println("InstanceStaticExample.method3()" + a);

	}

	// static method
	public static void method4() {
		System.out.print("InstanceStaticExample.method4()");

	}

	public static void main(String[] args) {

		InstanceStaticExample ise = new InstanceStaticExample();
		System.out.println("instance variable value " + ise.a);// 10
		ise.method1();// 10

		System.out.println("static varible value-->" + InstanceStaticExample.str);//

		InstanceStaticExample.method2();// InstanceStaticExample.method2()

	}

}
