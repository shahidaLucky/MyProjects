package javaObjects;

public class TestStatic {
	// if method is static variable here should be static too in order t access
	//static int keyChain;
	int keyChain=0; // if it is not static it is only available for this class not accessible by any static method

	public static void main(String[] args) {
		TestStatic ts = new TestStatic(); // if we use static method and static class we don't need this line 
		//can call the method by------- keyChain();
		ts.keyChain();// calling in the main method

	}
  //static void keyChain(){
	//keyChain++;
	//}
	void keyChain() {
		keyChain++; 
		// you have to make the variable to static in order to access it in the class level because static method
		System.out.println(keyChain); // if u don't call the method in the main method it will not print anything
	}
}
