package com.training.coreoops;

public class TestImpl implements InterfaceI {

	@Override
	public void method1() {
		System.out.println("override method");

	}

	public static void main(String[] args) {
		System.out.println("i  value -->" + i);
		System.out.println("j  value -->" + j);
	}

}
