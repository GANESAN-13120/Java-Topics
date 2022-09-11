package com.Upcasting.org;

public class Speker extends Television {
@Override	
public void ref() {
	
	System.out.println("Speaker is a child class");
}

   public static void main(String[] args) {
	
	   Television te = new Speker();
	   
	   te.ref();
	  
}


}
