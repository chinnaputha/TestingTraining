package com.training.corelogic;

/**
 * Class for Array Diagonal Sum
 * @author Chinna.Putha
 *
 */
public class ArrayDiagonalSum {

/**
 * Method for 2D Array Diagonal sum
 */
public static  void diagonalSumExample(){
		
		int multiAr[][] = new int[3][3];
		multiAr[0][0]=1;
		multiAr[0][1]=2;
		multiAr[0][2]=3;
		
		multiAr[1][0]=4;
		multiAr[1][1]=5;
		multiAr[1][2]=6;
		
		
		multiAr[2][0]=7;
		multiAr[2][1]=8;
		multiAr[2][2]=9;
		
		System.out.println("2D Array Example");
		int diagonalSum = 0;
		for(int i=0;i<3;i++) {
			System.out.println("diagonal values -->"+multiAr[i][i]);
			//diagonalSum = diagonalSum+multiAr[i][i];
			diagonalSum += multiAr[i][i];
		}
		System.out.println("Diagonal sum -->"+diagonalSum);
}
	public static void main(String[] args) {
		diagonalSumExample();

	}

}
