package com.training.corejava;

public class TernanryOperator {

	public static void main(String[] args) {
		
		int a,b;
		
		a=10;
		
		b= (a==1)?30:20;
		System.out.println("b value "+b);//20
		
		b= (a==10)?30:20;
		System.out.println("b value "+b);//30
		
		
		int age=15;
		
		String output = (age>=18)?"Eligle for vote":"Not Eligile for vote";
		System.out.println("Final value -->"+output);

	}

}
