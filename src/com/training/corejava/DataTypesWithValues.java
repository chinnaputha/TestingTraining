package com.training.corejava;

/**
 * This class to display data types with assigned values
 * @author Chinna.Putha
 *
 */
public class DataTypesWithValues {
	byte b =123;
	short s=20001;
	int i=2000123456;
	long l=2000123456;
	float f= 2154.25f;
	double d=254568.20045;
	boolean bo=true;
	char c ='c';

	public static void main(String[] args) {
		
		DataTypesWithValues dt = new DataTypesWithValues();
		
		System.out.println("Default value byte "+dt.b);
		System.out.println("Default value short "+dt.s);
		System.out.println("Default value int "+dt.i);
		System.out.println("Default value long "+dt.l);
		System.out.println("Default value float "+dt.f);
		System.out.println("Default value double "+dt.d);
		System.out.println("Default value boolean "+dt.bo);
		System.out.println("Default value char "+dt.c);
		

	}

}
