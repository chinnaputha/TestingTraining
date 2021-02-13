package com.training.corelogic;

/**
 * Class to sum the values of array
 * 
 * @author sanjeev
 *
 */
public class ArraySum {

	/**
	 * Method to sum the array values
	 */
	public static void sumOArray() {

		int multiAr[][] = new int[3][3];
		multiAr[0][0] = 1;
		multiAr[0][1] = 2;
		multiAr[0][2] = 3;

		multiAr[1][0] = 4;
		multiAr[1][1] = 5;
		multiAr[1][2] = 6;

		multiAr[2][0] = 7;
		multiAr[2][1] = 8;
		multiAr[2][2] = 9;

		System.out.println("2D Array sum");

		int ArraySum = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

//			System.out.println(multiAr[i][j]);

				ArraySum = ArraySum + multiAr[i][j];
			}
		}

		System.out.println(ArraySum);
	}

	public static void main(String[] args) {
		sumOArray();

	}

}