package com.training.corelogic;

	/**
	 * Class to print fibonacci series up to 100 numbers using for loop
	 * 
	 * @author sanjeev.Reddy
	 *
	 */
	public class Fibonacci {

		int n = 10;
		int f = 0, s = 1, t;
		int temp=0;
		
		/**
		 * Method to perform fibonacci series upto 100 numbers
		 */
		public void fibonacciSeries() {

			System.out.println(f);
			System.out.println(s);

			for (int i = 0; i < n; i++) {
				t = f + s;
				if (t >= 100) {
					break;
				}
				System.out.println(t);
				f = s;
				s = t;
			}
		}

		public static void main(String[] args) {
			Fibonacci fibo = new Fibonacci();
			fibo.fibonacciSeries();

		}

	}


