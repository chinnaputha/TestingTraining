package com.training.corelogic;

public class StringReplaceExample {

	static int stringReplace(String str) {
		str = str.replace("$", "");
		System.out.println("after replace1 " + str);

		str = str.replace(",", "");
		System.out.println("after replace2 " + str);

		int intStrValue1 = Integer.parseInt(str);
		System.out.println(" value after replacing " + intStrValue1);

		return intStrValue1;
	}

	public static void main(String[] args) {
		System.out.println("String replace -->"+StringReplaceExample.stringReplace("$9,499"));
		System.out.println("String replace -->"+StringReplaceExample.stringReplace("1,235$"));

	}

}
