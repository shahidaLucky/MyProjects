package javaLoopsPractice;

public class NestedLoop {

	public static void main(String[] args) {

		int counter = 0;
		for (int idx = 0; idx <= 100; idx++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println("The value of idx was: " + idx + "---------" + j);
				counter++;
			}
		}
		System.out.println('\n'+"COUNTER :" +counter);
	}

}
