package com.training.corelogic;

/**
 * Class to print traingle logic
 * 
 * @author Balu
 * @param args
 */
public class TraiangleLogic {

	/**
	 * Method to print traingle logic
	 */
	public void traingle() {
		System.out.println("using for loop");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				System.out.print('\t');
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		TraiangleLogic tl = new TraiangleLogic();
		tl.traingle();

	}

}
