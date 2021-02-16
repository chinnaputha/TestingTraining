package com.training.coreoops;

public class StudentEncap {

	public static void main(String[] args) {
		Student st = new Student();
		st.setSid(100);
		st.setSname("Ashok");
		st.setsAge(10);
		
		System.out.println("Student details");
		System.out.println("student id-->"+st.getSid());
		System.out.println("student Name-->"+st.getSname());
		System.out.println("student Age-->"+st.getsAge());
	}

}
