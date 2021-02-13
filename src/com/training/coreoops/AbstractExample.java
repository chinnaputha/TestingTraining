package com.training.coreoops;

public abstract class AbstractExample {
	
	//concrete method - fully defined methods
	public void method1() {
		System.out.println("AbstractExample.enclosing_method()");
	}
	
	//concret method
	public  void method2() {
		System.out.println("");
	}
	
	//abstract method - undefined method
	public abstract void method3();
	

}
