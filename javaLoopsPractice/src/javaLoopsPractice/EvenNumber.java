package javaLoopsPractice;

public class EvenNumber {

	public static void main(String[] args) {
		
		int counter = 0;
		for(int i=0; i<=100; i++) { // i=i+2 same as
			System.out.println(i);
			int temp = counter + 1;
			counter = temp;
			
		}

	}

}
