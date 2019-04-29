package javaUdemyProblems;

import javax.naming.spi.DirStateFactory.Result;

//import ignore.TestingUtils;

public class ProblemOne {
	/**
	 * Given a string of odd length, return the middle 3 characters from the string,
	 * so the string <b>"Monitor"</b> yields <b>"nit"</b>. If the string length is
	 * less than 3, return the string as is. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * middleThree("bunny") <b>---></b> "unn" <br>
	 * middleThree("peter") <b>---></b> "ete" <br>
	 * middleThree("Jamaica") <b>---></b>"mai" <br>
	 */

	public static String middleThree(String str) {
		String result = str;

		// get the middle 3 characters
		if (str.length() >= 3) {
			int midIndex = str.length() / 2; // diving by 2 the total no-of-index gives the middle-index
			result = str.substring(midIndex - 1, midIndex + 2);
		}
		return result;
	}

	public static void main(String args[]) {
		String output = middleThree("Arshan");
		System.out.println("The middle three characters of the given string are : " + '\n' + output);
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
//	public static void main(String args[]) {
//		TestingUtils.runTests();
//	}
}
