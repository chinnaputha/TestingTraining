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
		
		String str5 =" Maven is build Tool ";
		String str6 ="Maven is build Tool";
		
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
	
		System.out.println("String index of  "+str4.indexOf("web"));//9
		
		System.out.println("str5 and str6  equals "+str5.trim().equals(str6));//false
		
		str6= str6.replace("Maven", "Gradle");//Gradle is build Tool
		System.out.println(" String replace --> "+str6);
		
		String str7 = "I Love My India";
		String[] strSplit = str7.split(" ");
		System.out.println("size of strSplit "+strSplit.length);//4
		System.out.println(" first element of array "+strSplit[3]);//India
		
		System.out.println("Array Elements ");
		for(int i=0;i<strSplit.length;i++) {
			System.out.println(strSplit[i]);
		}
		
		System.out.println("Array Elements in reverse order");
		for(int i=strSplit.length-1;i>=0;i--) {
			System.out.println(strSplit[i]);
		}
		
	}

}
