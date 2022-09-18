 package com.three_classes_access_in.org;

public class Socialmedia extends Whatsapp {
	public void information() {
		System.out.println("Types of Information");
	}
	public void telegram() {
		System.out.println("We can Download Movies");
		
	}

	public static void main(String[] args) {
		
		Socialmedia sM = new Socialmedia();
		// TODO Auto-generated method stub
		sM.chat();
		sM.phots();
		sM.status();
		sM.telegram();
		sM.video_and_Audio_calls();
		sM.information();
        
	}

}
