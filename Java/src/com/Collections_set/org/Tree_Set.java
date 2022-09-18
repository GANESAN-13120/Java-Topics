package com.Collections_set.org;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
	
public static void main(String[] args) {
		
		Set<String> s = new TreeSet<>();
		Set<Integer> i = new TreeSet<>();
		
		s.add("java");
		s.add("Amazing");
		i.add(500);
		s.add("nice");
		s.add("java");
		s.add("Wonderful");
		i.add(300);
		System.out.println(s);
		System.out.println(i);

		int size = i.size();
	    System.out.println(size);
	    
	    int size2 = s.size();
		System.out.println(size2);

	    
	    s.remove("nice");
	    System.out.println(s);
	    
	    s.clear();
	    System.out.println(s);
	    
	    boolean addAll = s.addAll(s);
	    System.out.println(addAll);
	    
	    boolean retainAll = s.retainAll(s);
	    System.out.println(retainAll);
	    
	    s.removeAll(s);
	    System.out.println(s);
	    
	    
	    
	   
	   
	   
		
	


	
	}}



