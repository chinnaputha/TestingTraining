package com.training.coreoops;

public class AXISBank  implements Interest{

	@Override
	public void interest(int p, int t) {
		double interest=(p*t*0.12)/100;
		System.out.println(" AXIS bank interest  -->"+interest);
		
	}

	

}
