package com.training.coreoops;

/**
 * Class to perform Encapsulation OOP Conect
 * 
 * @author Chinna.Putha
 *
 */
public class Employee {

	private String username = "ashok1@gmail.com";// variable
	private String password = "abc@123";

	public void setUsername(String username) {// argument username
		System.out.println("username -->" + this.username);
		this.username = username;
		System.out.println("username after set-->" + this.username);
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {
		Employee e = new Employee();

		e.setUsername("Ashok@gmail.com");
		e.setPassword("abc@123");

		System.out.println("username -->" + e.username);
		System.out.println("password -->" + e.password);
	}
}
