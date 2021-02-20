package com.training.coreoops;

/**
 * Class to perform method overloading 
 */
public class MethodOverloadingExample {

	void add(int a, int b) {
		int c=a+b;
		System.out.println(" C value" +c);
	}
	
	void add(int a, int b,int c) {
		int d=a+b+c;
		System.out.println(" C value with 3 args" +c);
	}
	
	int add(String a, String b) {
		int a1= Integer.parseInt(a);
		int b1= Integer.parseInt(b);
		int c=a1+b1;
		System.out.println(" C value with String" +c);
		return c;
	}
	
	double add(double a, double b) {
		double c=a+b;
		System.out.println(" C value with Double" +c);
		return c;
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample moe= new MethodOverloadingExample();
		moe.add(10, 20); //30
		moe.add(10, 20, 30);//60
		moe.add(1.24, 1.85);//3.09
		moe.add("1", "2");//10
		
		String str ="$9,499"; //9499
		
		
		str = str.replace("$", "");
		System.out.println("after replace1 "+str);
		
		str = str.replace(",", "");
		System.out.println("after replace2 "+str);
		
		int intStrValue1 = Integer.parseInt(str);
		System.out.println(" value after replacing "+intStrValue1);
	}
}
