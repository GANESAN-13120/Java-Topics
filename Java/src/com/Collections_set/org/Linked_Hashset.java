package com.Collections_set.org;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset {
	
public static void main(String[] args) {
		
		Set<String> s = new LinkedHashSet<>();
		s.add("java");
		s.add("Amazing");
		s.add("nice");
		s.add("java");
		s.add("Wonderful");
		s.add("100");
		System.out.println(s);
		
		int size = s.size();
	    System.out.println(size);
	    
	    boolean remove = s.remove(s);
	    System.out.println(remove);
	    
	    boolean set = s.isEmpty();
	    System.out.println(set);
	    
	    boolean contains = s.contains("Amazing");
	    System.out.println(contains);
	    
	    s.clear();
	    System.out.println(s);
	    
	    boolean addAll = s.addAll(s);
	    System.out.println(addAll);
	    
	    boolean retainAll = s.retainAll(s);
	    System.out.println(retainAll);
	    
	    s.removeAll(s);
	    System.out.println(s);
	    
	    
	    
	   
	   
	   
		
	


	
	}}



