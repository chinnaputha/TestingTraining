package com.training.corejava;

/**
 * Class to perform looping(while,for, do while) operations
 * 
 * @author Chinna.Putha
 *
 */
//Multiline comment -- Ctrl+shift+/
// uncomment -- Ctrl+shift+i
public class LoopsTest {

	/**
	 * Method to perform loop using while
	 */
	public void whileLoop() {
		System.out.println("Using while loop");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}

	/**
	 * Method to perform loop using For
	 */
	public void forLoop() {
		System.out.println("Using For loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

	}

	// 1 to 100 numner
	public void forLoop2() {
		System.out.println("Using For loop print 1 to 100");
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

	}

	/**
	 * Method to perform loop using doWhile
	 */
	public void doWhileLoop() {
		System.out.println("Using do while loop");
		int i = 0;
		do {
			System.out.println("Hello " + i);
			i++;

		} while (i < 5);
	}

	public static void main(String[] args) {
		LoopsTest lt = new LoopsTest();
//Ctrl+/
		lt.whileLoop();
		lt.forLoop();
		lt.forLoop2();

		lt.doWhileLoop();

	}

}
