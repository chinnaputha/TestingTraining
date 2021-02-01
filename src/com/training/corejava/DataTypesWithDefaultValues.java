package com.training.corejava;

/**
 * This class to display data types default values
 * @author Chinna.Putha
 *
 */
public class DataTypesWithDefaultValues {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bo;
	char c;

	public static void main(String[] args) {
		
		DataTypesWithDefaultValues dt = new DataTypesWithDefaultValues();
		
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
