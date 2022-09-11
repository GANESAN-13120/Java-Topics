package com.Collections_List.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Array_List {

	public static void main(String[] args) {
	System.out.println("----------Collections List of methods--------------");
	List<Object> li = new ArrayList<>();
	
	li.add("GANESAN");
	li.add(100);
	li.add("computers");
	li.add(200);
	li.add(300);
	li.add("Greens");
	li.add("Technology");
	li.add(400);
	li.add(500);
	System.out.println(li);
	//1.size
	int size = li.size();
	System.out.println(size);
	//2.get 
	Object get = li.get(5);
	System.out.println(get);
	//3.set
	li.set(2,"Information Technology");
	System.out.println(li);
	//4.remove
	li.remove(7);
	System.out.println(li);
	//5.index of
	int indexof = li.indexOf(300);
    System.out.println(indexof);
    //6.contains
    boolean contains = li.contains("elcome");
    System.out.println(contains);
    //7.addall
    li.addAll(li);
    System.out.println(li);
    //8.retain all
    li.retainAll(li);
    System.out.println(li);
    //9.removeall
    li.removeAll(li);
    System.out.println(li);
    //10.clear
    li.clear();
    System.out.println(li);
    //11.add
    li.add(size);
    System.out.println(li);
   
    
	}

}
