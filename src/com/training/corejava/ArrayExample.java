package com.training.corejava;

/**
 * Class to perform Array examples
 * 
 * @author Chinna.Putha
 *
 */
public class ArrayExample {

	/**
	 * Method to perform 1D Array operations
	 */
	public static void onedArrayExample() {
		int a = 10, b = 20, c = 30;

		int arr[] = { 10, 20, 30, 40 };

		// int []arr2 = {10,20,30,40}; //another way to create array
		// int[] arr3 = {10,20,30,40}; //another way to create array

		System.out.println("size of the array -->" + arr.length);// 4
		System.out.println("index of array -->" + arr[3]);// 40

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int intAr[] = new int[10];
		System.out.println("Array lentht -->" + intAr.length);
//		ar[0] = 1;
//		ar[1] = 2;
//		ar[2] = 3;
//		ar[3] = 4;
//		ar[4] = 5;

		// adding array values using for loop
		int count = 10;
		for (int i = 0; i < intAr.length; i++) {
			++count;// 11
			intAr[i] = count; // ar[0]= 11,
								// ar[1] =12
		}

		// printing array values using for loop
		for (int i = 0; i < intAr.length; i++) {
			System.out.println(intAr[i]);
		}

		// int ar2[6];
		// int [6]ar3;

	}

	/**
	 * Method to perform 2D Array operations
	 */
	public static  void TwodArrayExample(){
		
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
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multiAr[i][j]+ " ");//
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//onedArrayExample();
		TwodArrayExample();

	}

}
