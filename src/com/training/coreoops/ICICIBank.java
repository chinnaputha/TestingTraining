package com.training.coreoops;

public class ICICIBank  implements Interest{

	@Override
	public void interest(int p, int t) {
		double interest=(p*t*0.15)/100;
		System.out.println("ICICI Bank interest -->"+interest);
		
	}

}
