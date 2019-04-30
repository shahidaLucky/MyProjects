package javaLoopsPractice;

public class ForLoop {

	public static void main(String[] args) {
		
		String name = "AnshkKDKDQWEIWEUEZ";
		
		System.out.println("************** Order ***********");
		for(int i=0; i<=name.length()-1; i++) {
			System.out.println("char :  " +name.charAt(i));
		}
		System.out.println("************** Reverse ***********");
		for(int i=name.length()-1; i>=0; i--) {
			System.out.println("Reverse char :  " +name.charAt(i));
		}

	}

}
