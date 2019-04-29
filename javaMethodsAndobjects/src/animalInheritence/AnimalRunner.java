package animalInheritence;

public class AnimalRunner {

	public static void main(String[] args) {
		//creating animal object from Animal class
		Animal a1 = new Animal(4, false);
		a1.getSound();
		a1.gotLife();
		
		//creating dog obj from Dog class
		Dog dog1 = new Dog(4, true, "Biscuit", false); // if you want to invoke all the method from Dog class make Dog obj
		System.out.println("Dog:");
		dog1.gotLife();
		dog1.sound();
		dog1.walk();
		
		Cat cat1 = new Cat(4, true, true);
		System.out.println("Cat: ");
		cat1.catchMouse();
		cat1.gotLife();
		cat1.getSound();
		
		

	}

}
