package com.training.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
	
	public void setExamplestest() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(100); // 0th index
		al.add(30);
		al.add(100);
		al.add(40);
		al.add(100);
		
		System.out.println("list values -->"+al);
		
		Set<Integer> hs = new HashSet<Integer>(al);
		System.out.println("removing duplicates-->"+hs);
		
		
	}
	
	public void setNoDuplicate() {
		Set<String> s = new HashSet<String>();
		s.add("Person10");
		s.add("Person1");
		s.add("Person2");
		s.add("Person3");
		s.add("Person1");
		System.out.println(s);
		
		System.out.println("size of the set-->"+s.size());
		for(String st: s) {
			System.out.println(st);
		}
		
		s.clear();
		System.out.println("size of the set post clear-->"+s.size());
		
	}

	public static void main(String[] args) {
		SetExample se = new SetExample();
		//se.setNoDuplicate();
		
		se.setExamplestest();

	}

}
