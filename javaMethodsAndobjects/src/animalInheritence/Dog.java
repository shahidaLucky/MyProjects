package animalInheritence;

public class Dog extends Animal {

	String name;
	boolean isTrainrd;

	Dog(int numberOfLegs, boolean isPet, String name, boolean isTrained) {
		super(numberOfLegs, isPet); // super constractor from the super class
		this.name = name;
		this.isPet = isTrained;
	}
	void walk() {
		System.out.println("SubClass: Dog only can walk  forward !");
	}
	
	void sound()  { // Overridden method from the Animal class
		System.out.println("SubClass: Since I am an animal, I can make sound! Dog barks !"); 
	}
	

}
