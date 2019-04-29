package library;

public class KidUsers implements LibraryUser {

	int age;
	String bookType;
	
	
	
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(age <=12 ) {
			System.out.println("You have successfully registered under a Kids Account");
		}else if(age >12 ) {
			System.out.println("Sorry, Age must be less then 12 to register as a Kid");
		}
	}

	@Override
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days.");
		}else {
			System.out.println("Oops, you are allowed to take only kods books");
		}
	}

}
