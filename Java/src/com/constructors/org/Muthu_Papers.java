package com.constructors.org;

public class Muthu_Papers {
	public  Muthu_Papers() {
		System.out.println("This is the invitation shop");
	}
	public  Muthu_Papers(String name) {
		System.out.println("All types invitations are"+ name);
	}
	public  Muthu_Papers(short number) {
		System.out.println("Minimum invitation price is Rs"+ number);
	}
	public  Muthu_Papers(int number) {
		System.out.println("Maximum invitaton price is Rs"+ number);
	}

	public static void main(String[] args) {
		
		Muthu_Papers m1 = new Muthu_Papers();
		Muthu_Papers m2 = new Muthu_Papers("available here");
		Muthu_Papers m3 = new Muthu_Papers(5);
		Muthu_Papers m4 = new Muthu_Papers(500);

	}

}
