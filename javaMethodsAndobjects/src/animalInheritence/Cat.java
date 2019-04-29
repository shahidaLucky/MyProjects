package animalInheritence;

public class Cat extends Animal {
	
	

	boolean canClimb;
	
	Cat(int numberOfLegs, boolean isPet, boolean canClimb) {
		super(numberOfLegs, isPet);
		this.canClimb = canClimb;
	}
	
	void sound() {
		System.out.println("Cat");
		System.out.println("SubClass: Since I'm ana animal, I can make sound! ");
	}
	
	void catchMouse() {
		System.out.println("SubClass: Cat can catch mice!");
	}
	
}
