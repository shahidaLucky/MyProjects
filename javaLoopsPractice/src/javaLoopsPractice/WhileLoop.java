package javaLoopsPractice;

public class WhileLoop {
	
	

	public static void main(String[] args) {
		
		String str ="We have a large inventory things in our wearhouse falling in"
				+ "the category:apperal and the slightly"
				+ "more in demand category:makeup along with the category:furniture and_.";

		
//		int count = 0;
//
//		while (count <= 100) {
//			System.out.println("Lucky :  " + count);
//			count = count + 1;
//			if(count == 30) {
//				break;
//			}
//		}

		printCategory(str);
	}
	
	/**
	 * 
	 * extract all categories from the string argument
	 * **/
	public static void printCategory(String string) {
		int i =0;
		while(true) {
			int found = string.indexOf("category:", i);
			if(found == -1) 
				break;
			int start = found +9; // start of the actual category
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end +1;
			
		}
	}
}
