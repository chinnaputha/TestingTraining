package com.training.coreoops;


/**
 * Class for Class implments interface Interface B
 * @author Chinna.Putha
 *
 */
public abstract class ClassImplementExample implements InterfacB {

	@Override
	public  void add(int a, int b) {
		int c=a+ b;
		System.out.println(" C add value -->"+c);
		
	}

	@Override
	public void sub(int a, int b) {
		int c= a-b;
		System.out.println(" C Sub value -->"+c);
		
	}

	
	public abstract void add(int a, int b, int c);

	

}
