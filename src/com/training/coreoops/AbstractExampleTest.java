package com.training.coreoops;

public abstract class AbstractExampleTest {
	
	//abstract methods
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	
	//concrete method
	public  void method4() {
		System.out.println("AbstractExampleTest.method4()");
	}
	
	public static void main(String[] args) {
		//AbstractExampleTest aet = new AbstractExampleTest();//object creation not possible for Abstract class
		//aet.method1();
	}
	
	

}
