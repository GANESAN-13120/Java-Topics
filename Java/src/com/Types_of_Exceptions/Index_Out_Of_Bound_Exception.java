package com.Types_of_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Index_Out_Of_Bound_Exception {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Integer integer = l.get(size);
		System.out.println(integer);
	}

}
