package com.training.coreoops;

/**
 * Class for example of Derived class - Dc
 * @author Chinna.Putha
 *
 */
public class Dc extends Bc {
	
	int b;
	public void show(){
		super.showTodisplay();
		System.out.println("i'm from Derived class show()");
		System.out.println("super class (Bc) val of a-->"+super.a);//100
		a=10;
		b=20;
		System.out.println("val of a-->"+a);//10
		System.out.println("val of b-->"+b);//
	}
	
	public static void main(String[] args) {		
		Dc d = new Dc();
		d.disp();
		d.show();
	
		
	}


}
