package com.training.corejava;

/**
 * Class to perform string manipulations
 * @author Chinna.Putha
 *
 */
public class StringsExample2 {
	
	public static void main(String[] args) {
		String str ="JavaSelenium";
		String str2 ="JavaSelenium";
		String str3 ="JAVASELENIUM";
		
		String str4 ="Selenium web browser automation"; 
		System.out.println("length of the string "+str.length());
		System.out.println("index of the string "+str.charAt(1));
		System.out.println("String uppercase "+str.toUpperCase());
		System.out.println("String lowercase "+str.toLowerCase());
		
		System.out.println("String equals "+str.equals(str2));//true
		System.out.println("String equals ignorecase "+str.equalsIgnoreCase(str3));//true
		
		
		System.out.println("String start with-->"+str4.startsWith("Selenium"));//true
		System.out.println("String ends with-->"+str4.endsWith("automation"));//true
		System.out.println("String contains with-->"+str4.contains("browser"));//true

		
		System.out.println("String sub "+str.substring(4));
		System.out.println("String sub with begin and end index "+str.substring(4,7));
	}

}
