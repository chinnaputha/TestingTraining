package com.training.corejava;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		String str1="java";
		String str2="java";
		String str3=str1;
		
		str1 = str1+"selenium";
		str1 = str1+"Testing";//
		
		String str4= new String("java");
		
		System.out.println("str1 oupput-->"+str1);
		
		
		StringBuffer sb = new StringBuffer("java");
		sb.append("selenium");
		
		StringBuilder sbuild = new StringBuilder("java");
		sbuild.append("selenium");

	}

}
