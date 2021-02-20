package com.training.coreoops;

/**
 * TestImpl - Derived/sub 
 * InterfaceI -Base/super/Parent
 * @author Chinna.Putha
 *
 */
public class TestImpl implements InterfaceI {
	static int i=22;

	@Override
	public void method1() {
		System.out.println("override method");

	}

	public static void main(String[] args) {
		System.out.println("i  value -->" + i);
		System.out.println("j  value -->" + j);
		
		//InterfaceI int1 = new InterfaceI();//interface not allowing to create an object
		//int1.method1();
	}

}
