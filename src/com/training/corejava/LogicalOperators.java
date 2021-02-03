package com.training.corejava;

/**
 * Class to perform logical operations
 * 
 * @author Chinna.Putha
 *
 */

//shortcut to minimize and maximize window -- Ctrl+M
public class LogicalOperators {

	/**
	 * method to perform logical operations
	 */
	public void logicOperators() {
		int a=8, b=4, c=-10;

		System.out.println("(a<b) && (b>c) --->"+((a<b)&&(b>c)));//false
													//8<4&&4>-10
													//F&&T -- F
		
		System.out.println("(b!=-c) || (a==b) --->"+((b!=-c)||(a==b)));//True
													//4!=10||8==4
													//T||F	
		
		System.out.println("!(b<=-a) --->"+!(b<=-a));//true
											//!(4<=-8)
											//!F -- True
													
		System.out.println("(a<b) || (b>c) --->"+((a<b)||(b>c)));//true
													//8<4||4>-10
													//F||T -- T
	}

	public static void main(String[] args) {
		LogicalOperators sfcasfsdfs = new LogicalOperators();
		sfcasfsdfs.logicOperators();
	}

}
