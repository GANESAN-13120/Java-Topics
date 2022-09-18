package com.Collections_Map.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hp = new HashMap <Integer,String>();
		//1.put
		hp.put(1,"Lotus");
		hp.put(2, null);
		hp.put(3, null);
		hp.put(4,"Jasmine");
		hp.put(5,"100");
		hp.put(null,"200");
		hp.put(null, "lily");
		//2.size
		int size = hp.size();
		System.out.println(size);
		//3.get
		String get=hp.get("Jasmine");
		System.out.println(get);
		//4.keyset
		Set<Integer> keySet = hp.keySet();
		System.out.println(keySet);
		//5.contains key
		boolean containsKey = hp.containsKey(4);
		System.out.println(containsKey);
		//6.values
		Collection<String> values = hp.values();
		System.out.println(values);
		//7.contains value
		boolean containsValue = hp.containsValue(values);
		System.out.println(containsValue);
		//8.entry set
		Set<Entry<Integer, String>> entrySet = hp.entrySet();
		System.out.println(entrySet);
		
		
	}

}
