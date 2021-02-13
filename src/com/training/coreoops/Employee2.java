package com.training.coreoops;

public class Employee2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setUsername("Test@gmail.com");
		e.setPassword("Test@123");
		System.out.println("username-->"+e.getUsername());
		System.out.println("password-->"+e.getPassword());
		
		e.setUsername("Raj@gmail.com");
		e.setPassword("asd@123");
		System.out.println("username-->"+e.getUsername());
		System.out.println("password-->"+e.getPassword());
		
		

	}

}
