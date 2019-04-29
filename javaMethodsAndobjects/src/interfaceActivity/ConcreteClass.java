package interfaceActivity;

public class ConcreteClass implements MyInterface, YourInterface {

	

	@Override
	public void sayHello(String test) {
		System.out.println("Hi");
		System.out.println("I'm from" +companyName);
	}
	

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	public void shakeHand(){
		System.out.println("Shake hands");
	}
	
	
	public static void main(String[] args) {
  //one way to instantiate
		ConcreteClass concreteClass = new ConcreteClass();
		
		concreteClass.sayHello();
		concreteClass.shakeHand();
		concreteClass.letsChat();
		
		
		
//other way of instantiate	
		//MyInterface myInterface = new ConcreteClass();
		
	}


	@Override
	public void letsChat() {
		// TODO Auto-generated method stub
		System.out.println("Lets have a coffee");
	}
}
