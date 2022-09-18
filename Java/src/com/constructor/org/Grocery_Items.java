package com.constructor.org;

public class Grocery_Items { 
	public Grocery_Items(){
		System.out.println("Dry fruit name is Almond");
	}
	public Grocery_Items(String name){
		System.out.println("Almond is :"+ name);
	}
	public Grocery_Items(int number){
		System.out.println("Alomond 1 kg is   :"+ number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Grocery_Items g1 = new  Grocery_Items();
		 Grocery_Items g2 = new Grocery_Items("Very good for health");
		 Grocery_Items g3 = new Grocery_Items(800);
	}

}
