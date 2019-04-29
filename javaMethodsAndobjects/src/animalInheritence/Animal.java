package animalInheritence;

public class Animal {

	int numberOfLegs;
	boolean isPet;

	Animal(int numberOfLegs, boolean isPet) { // Constructor
		this.numberOfLegs = numberOfLegs;
		this.isPet = isPet;
	}// end of constructor

	 void sound() {
		System.out.println("Super: Since I am an animal, I can make sound ! ");
	}
	public void getSound() {
		sound();
	}
	void gotLife() {
		System.out.println("Super: Since I am an animal, I Live");
	}
}
