package com.training.automation;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);//0 index
		al.add(20);//1 index
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		//al.add("abc");
		
		System.out.println("No of value"+al.size());//6
		
		System.out.println("get value using index position"+al.get(4));//getting value based on index position
		
		
				
		//Enhanced for loop
		for(Integer a:al) {
			System.out.println("list values -->"+a);
		}
		
		//using for loop
		for(int i=0;i<al.size();i++) {
			System.out.println("values getting using for loop -->"+al.get(i));
		}

	}

}
