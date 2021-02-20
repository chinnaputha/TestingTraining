package com.training.corepack;

class A {

	public void show() {
		System.out.println("A.show()");
	}
}

class B extends A {
	public void show() {
		System.out.println("B.show()");
	}

	public void disp() {
		System.out.println("B.disp()");
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.show();

		A a1 = new B();
		a1.show();

	}
}
