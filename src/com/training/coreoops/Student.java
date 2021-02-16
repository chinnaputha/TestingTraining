package com.training.coreoops;
/**
 * Class to perform Encapsulation
 * @author Chinna.Putha
 *
 */
public class Student {

	private int sid=500;
	private String sname;
	private int sAge;
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public int getSid() {
		return sid;
	}
	
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	public int getsAge() {
		return sAge;
	}
	

}
