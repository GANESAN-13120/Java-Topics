package com.Collections_set.org;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Hash_Set {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("java");
		s.add("Amazing");
		s.add("nice");
		s.add("java");
		s.add("Wonderful");
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
