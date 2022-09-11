package com.Collections_Map.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Tree_Map {
	
public static void main(String[] args) {
		
		Map<Integer,String> hp = new TreeMap<Integer,String>();
		//1.put
		hp.put(1,"Lotus");
		hp.put(2, "200");
		hp.put(3, "500");
		hp.put(4,"Jasmine");
		hp.put(5,"100");
		hp.put(6,"200");
		hp.put(7, "lily");
		//2.size
		int size = hp.size();
		System.out.println(size);
		//3.keyset
		Set<Integer> keySet = hp.keySet();
		System.out.println(keySet);
		//4.contains key
		boolean containsKey = hp.containsKey(5);
		System.out.println(containsKey);
		//5.values
		Collection<String> values = hp.values();
		System.out.println(values);
		//6.contains value
		boolean containsValue = hp.containsValue("Jasmine");
		System.out.println(containsValue);
		//7.entry set
		Set<Entry<Integer, String>> entrySet = hp.entrySet();
		for(Entry<Integer, String> entry:entrySet) {
			
		}
		System.out.println(entrySet);
		//8.get
		String string = hp.get(7);
		System.out.println(string);
		
	}

}



