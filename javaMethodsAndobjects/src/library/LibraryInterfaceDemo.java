package library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		System.out.println("     TestCase#1 " +'\n'+ "-------Kid1---------");
		KidUsers kid1 = new KidUsers(10, "Kids");
		kid1.registerAccount();
		kid1.requestBook();
		
		System.out.println("-------Kid2---------");
		KidUsers kid2 = new KidUsers(18, "Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		
		System.out.println("    TestCase#2 "+'\n'+"------Adult1---------");
		AdultUser adult1 = new AdultUser(5, "Kids");
		adult1.registerAccount();
		adult1.requestBook();
		
		System.out.println("------Adult2---------");
		AdultUser adult2 = new AdultUser(23, "Fiction");
		adult2.registerAccount();
		adult2.requestBook();
	}

}
