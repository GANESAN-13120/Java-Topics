package com.String_Types.org;

public class Test {

	public static void main(String[] args) {
		
		String s1 = "All is well";
		String s2 = "All is well";
		System.out.println("---------Inmutable--------");
		
        int ref1 = System.identityHashCode(s1);
        System.out.println(ref1);
        
        int ref2 = System.identityHashCode(s2);
        System.out.println(ref2);
        
        String concat = s1.concat(s2);
        System.out.println(concat);
        
        int ref3 = System.identityHashCode(concat);
        System.out.println(ref3); 
        
        StringBuilder s3 = new StringBuilder("Happy");
        StringBuilder s4 = new StringBuilder("Happy");
        System.out.println("---------Mutable------------");
        
        int ref4 = System.identityHashCode(s3);
        System.out.println("ref4");
        
        int ref5 = System.identityHashCode(s4);
        System.out.println(ref5);
        
        StringBuilder append = s3.append(s4);
        System.out.println(append);
        
        int ref6 = System.identityHashCode(append);
	    System.out.println(ref6);
	}

}
