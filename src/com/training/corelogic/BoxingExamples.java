package com.training.corelogic;

/**
 * Class to perform Autboxing and Auto unboxing using wrapper classes
 * @author Chinna.Putha
 *
 */
public class BoxingExamples {

	public static void main(String[] args) {
		int a=10;//primitive int data type
		Integer i=a;//converting primitive to Object -- Autoboxing
	
	
		Character ch='c';
		char c=ch;//Converting Object to primitive - AutoUnboxing
		
		
		String s="10";
		String s2="20";
		System.out.println("s value-->"+(s+s2));
		
		//Converting String value to int using Wrapper class i.e. Integer
		int sInt = Integer.parseInt(s);
		int s2Int = Integer.parseInt(s2);
		
		System.out.println("int sum value-->"+(sInt+s2Int));
		
		double d1 = Double.parseDouble(s);
		double d2 = Double.parseDouble(s2);
		
		System.out.println("d1 and d2 values-->"+d1+"--"+d2);
		System.out.println("double sum value-->"+(d1+d2));

	}

}
