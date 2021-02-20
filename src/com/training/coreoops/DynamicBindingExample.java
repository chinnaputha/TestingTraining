package com.training.coreoops;

class A {
	
	int value=10;
	public void show() {
		System.out.println("Iam in Class A");
	}
	
}

class B extends A{
	
	@Override
	public void show() {
		value = 20;
		System.out.println("I am in Class B");
	}
}

class C extends A {
	
	@Override
	public void show() {
		System.out.println("I am in Class C");
	}
	
	public void toDisplay() {
		System.out.println("C class Display");
	}
}


public class DynamicBindingExample {

	public static void main(String[] args) {
		
		A a  = new A();
		a.show();// Iam in Class A
		
		B b = new B();
		b.show();// Iam in Class B
		
		
		A a1 = new B();// Parent Class (A) reference variable a1 pointing to B class Object
    					//with parent class reference calling method show()
		a1.show();//
		
		C c= new C();
		c.show();
		//c.toDisplay();
		
		A a2= new C();
		a2.show();//I am in Class C
		
		
	}

}
