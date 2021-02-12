package com.training.corelogic;

/**
 * Class to perform swap without temp variable
 * @author Ravi
 *
 */
public class Swapping {

	public void swapWithoutTemp() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping:" + "a=" + a + ",b=" + b);
	}
	
	public void swapWithTemp() {
		int a=10,b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("value of a is :"+a);
		System.out.println("value of b is:"+b);
	}
	
	
	public static void main(String[] args) {
		Swapping sw= new Swapping();
		sw.swapWithoutTemp();
		sw.swapWithTemp();
		
	}

}
