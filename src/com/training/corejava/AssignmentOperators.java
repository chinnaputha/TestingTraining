package com.training.corejava;

/**
 * Class to perform Assignment operators
 * @author Chinna.Putha
 *
 */
public class AssignmentOperators {
	
	public void assignmentOperations() {
		int a=8,b=4;
		System.out.println("a+=b or a=a+b -->"+(a+=b)); //8+4 -->a=12
		System.out.println("a-=3 or a=a-3 -->"+(a-=3)); //12-3 -->a=9
		System.out.println("a*=7 or a=a*7 -->"+(a*=7)); //9*7 -->a=63
		System.out.println("a/=b or a=a/b -->"+(a/=b)); //63/4 -->a=15
		System.out.println("a%=5 or a=a%5 -->"+(a%=5)); //15%5 -->a=0
	}
	
	public void assignmentOperations(int a, int b) {
		
		System.out.println("********method with arguments*********");
		System.out.println("a value "+a);
		System.out.println("b value "+b);
		System.out.println("a+=b or a=a+b -->"+(a+=b)); 
		System.out.println("a-=3 or a=a-3 -->"+(a-=3)); 
		System.out.println("a*=7 or a=a*7 -->"+(a*=7)); 
		System.out.println("a/=b or a=a/b -->"+(a/=b)); 
		System.out.println("a%=5 or a=a%5 -->"+(a%=5)); 
	}
	
	

	public static void main(String[] args) {
		AssignmentOperators assignOp = new AssignmentOperators();
		assignOp.assignmentOperations();
		assignOp.assignmentOperations(10, 6);

	}

}
