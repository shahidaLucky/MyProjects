package library;

public class AdultUser implements LibraryUser {

	int age;
	String bookType;

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age >= 12) {
			System.out.println("You have successfully registered under a Adult Account");
		} else if (age < 12) {
			System.out.println("Sorry, Age must be greater then 12 to register as an Adult");
		}

	}

	@Override
	public void requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		} else {
			System.out.println("Oops, you are allowed to take only Adult Fiction books");
		}

	}

}
