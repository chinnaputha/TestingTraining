package com.training.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public void hmExample() {
		Map<String,String> map = new HashMap<String, String>();
		map.put("Ap", "Hyd");
		map.put("Karnata","Banglore");
		map.put("TN","Chennai");
		map.put("Kerala","TRivendram");
//		map.put(null,null);
//		map.put(null,"test");
//		map.put(null,"test2");
		System.out.println("hm values-->"+map);
		Set<String> ss=  map.keySet();
		System.out.println("only key values-->"+ss);
		
		System.out.println("get value using key-->"+map.get("Karnata"));
		
		Collection<String> vv = map.values();
		
		System.out.println("only values-->"+vv);
		
		for(String key:map.keySet()) {
			System.out.println("Key "+key+" value "+map.get(key));
		}
		
	}
	
	public static void main(String[] args) {
		HashMapExample hme = new HashMapExample();
		hme.hmExample();

	}

}
