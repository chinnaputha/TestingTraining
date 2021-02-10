package com.training.corejava;

/**
 * Class for to perform operations using string, string builder and String buffer
 * @author Chinna.Putha
 *
 */
public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		String str1="java"; //String literals are storing into string constant pool
		String str2="java";
		String str3=str1;
		
		str1 = str1+"selenium";
		str1 = str1+"Testing";//
		
		String str4= new String("java");//String objects are storing into Heap memory
		
		System.out.println("str1 oupput-->"+str1);
		
		
		StringBuffer sb = new StringBuffer("java");//String buffer  storing into Heap memory
		sb.append("selenium");
		
		StringBuilder sbuild = new StringBuilder("java");//String Builder storing into Heap memory
		sbuild.append("selenium");

	}

}
