package com.training.coreoops;

public class SBIBank  implements Interest{

	@Override
	public void interest(int p, int t) {
		double interest=(p*t*0.13)/100;
		System.out.println("SBI loan interest -->"+interest);
	}

}
