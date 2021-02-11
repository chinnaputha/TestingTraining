package com.training.corejava;

/**
 * Class to perform string comparison using == and equals()
 * @author Chinna.Putha
 *
 */
//Ctrl+shift+R -- search for class
public class StringComparision {

	public static void main(String[] args) {
		String str1="java"; //String literals are storing into string constant pool
		String str2="java";
		String str3=str1;
		
		String str4 = new String("java");//String Objects - heap memory
		String str5 = new String("java");
		
		String str6 = new String(str1);
		
		System.out.println("Str1 == Str2 -->"+(str1==str2));//true
		System.out.println("Str1 == Str3 -->"+(str1==str3));//true
		System.out.println("Str2 == Str3 -->"+(str2==str3));//true
		
		System.out.println("Str1 equals Str2 -->"+str1.equals(str2));//true
		System.out.println("Str1 equlas Str3 -->"+str1.equals(str3));//true
		System.out.println("Str2 equlas Str3 -->"+str2.equals(str3));//true
		
		
		System.out.println("Str3 == Str4 -->"+(str3==str4));//false
		System.out.println("Str3 equals Str4 -->"+str3.equals(str4));//true
		
		
		System.out.println("Str6 == Str1 -->"+(str6==str1));//false
		System.out.println("Str6 equals Str1 -->"+str6.equals(str1));//true
		
		
		System.out.println("Str4 == Str5 -->"+(str4==str5));//false
		
		
		

	}

}
