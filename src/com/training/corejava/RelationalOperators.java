package com.training.corejava;

/**
 * 
 * Class to perform Relational operations
 * @author Chinna.Putha
 *
 */

//Alt+Shift+J = shortcut for java doc
public class RelationalOperators {
	
	/**
	 * Method to perform relations operations
	 */
	public void relationalOperators() {
		int a=8,b=4;
		System.out.println("a<b  --->"+(a<b)); //false
		System.out.println("a<=10  --->"+(a<=10));//true
		System.out.println("a>b  --->"+(a>b));//true
		System.out.println("a>=10  --->"+(a>=10));//false
		System.out.println("a==b  --->"+(a==b));//false
		System.out.println("a!=(-4)  --->"+(a!=(-4)));//true
	}
	
	
	public static void main(String[] args) {
		
		//<class name> objectname = new <classname>();
		RelationalOperators relOp = new RelationalOperators();
		relOp.relationalOperators();
		
		
		
	}

}
