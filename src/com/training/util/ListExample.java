package com.training.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public void elementsMulti() {
		List al = new ArrayList();
		al.add(1);
		al.add(true);
		al.add('c');
		al.add("Hello");
		System.out.println("list elements-->" + al);

		for (Object a : al) {
			System.out.println(a);
		}
	}

	
	public void elementsMulti2() {
		List al = new LinkedList();
		al.add(1);
		al.add(true);
		al.add('c');
		al.add("Hello");
		System.out.println("list elements-->" + al);

		for (Object a : al) {
			System.out.println(a);
		}
	}
	public void elementsType() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(100); // 0th index
		al.add(30);
		al.add(80);
		al.add(40);
		al.add(100);

		System.out.println("List size-->" + al.size());
		System.out.println("List size-->" + al.isEmpty());
		System.out.println("List size-->" + al.contains(100));//

		System.out.println("Retriving elements from arraylist");
		// retriving elements
		for (Integer i : al) {
			System.out.println(i);
		}

		System.out.println("using get method-->" + al.get(3));// 40

		al.remove(4);

		System.out.println("Retriving elements from arraylist post remove");
		// retriving elements
		for (Integer i : al) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		ListExample le = new ListExample();
		le.elementsType();

	}

}
