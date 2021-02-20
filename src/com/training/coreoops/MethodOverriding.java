package com.training.coreoops;


public class MethodOverriding {

	public static void main(String[] args) {
		SBIBank sb= new SBIBank();
		sb.interest(100000, 12);
		
		AXISBank ab= new AXISBank();
		ab.interest(100000, 12);
		
		ICICIBank ib= new ICICIBank();
		ib.interest(100000, 12);
	}
}
