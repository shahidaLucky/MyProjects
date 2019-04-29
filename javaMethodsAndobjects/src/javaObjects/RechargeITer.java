package javaObjects;

import java.awt.peer.SystemTrayPeer;

public class RechargeITer {
	String name;
	String commitID;
	String email;
	String buddyName;
	int javaKBAScore;
	String awsID;
	String beeLine;

	// Constructor 1
	RechargeITer(String name,String commitID,int javaKBAScore){
		this.name= name;
		this.commitID = commitID;
		this.javaKBAScore = javaKBAScore;
	}

	// Constructor 2
	RechargeITer(String name,String email,String awsID){
		this.name= name;
		this.email = email;
		this.awsID = awsID;
	}
	//Default constructor
	RechargeITer(){
		
	}
	//Method Overloading
	int add(int x, int y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}
	//sttaic method
	public static void PrintMe(RechargeITer obj) {
		System.out.println(obj.name);
		System.out.println(obj.commitID);
		System.out.println(obj.email);
		System.out.println(obj.awsID);
		System.out.println(obj.buddyName);
		System.out.println(obj.javaKBAScore);
	}
	//non-static method
	public void PrintMe() {
		System.out.println(name);
		System.out.println(commitID);
		System.out.println(email);
		System.out.println(awsID);
		System.out.println(buddyName);
		System.out.println(javaKBAScore);
	}


	public static void main(String[] args) {

		RechargeITer lucky = new RechargeITer("Shahida Lucky","ADCBQD5",100 );

//		lucky.name = "Shahida Lucky";
//		lucky.commitID = "ADCBQD5";
		lucky.email = "shahida.lucky@bnymennol.com";
		lucky.awsID = "shahida.lucky";
		lucky.buddyName = "Arian";
		//lucky.javaKBAScore = 100;
		
		RechargeITer kokab = new RechargeITer("Kokab Askay,", "awsID",100 );

//		lucky.name = "Shahida Lucky";
//		lucky.commitID = "ADCBQD5";
		lucky.email = "shahida.lucky@bnymennol.com";
		lucky.awsID = "shahida.lucky";
		lucky.buddyName = "Arian";
		//lucky.javaKBAScore = 100;	
		
	
		
		RechargeITer ins1 = new RechargeITer("Instructor1", "ins1@perscolas.com","ins1");
		ins1.add(2,5);
		ins1.add(2, 3, 4);
	
		//PrintMe(lucky); if the method is non static this doesn't work
		
		System.out.println("---Calling non-static method---");
		lucky.PrintMe();
		System.out.println("----Calling static method-- ");
		lucky.PrintMe(lucky);
		
		RechargeITer[] pList = new RechargeITer[25];
		pList[0] = lucky;
		pList[1] = kokab;
		
		for(int i = 0; i< 2; i++) {
			pList[i].PrintMe();
		}

	}

	private static void RechargeITer() {
		// TODO Auto-generated method stub
		
	}

}
