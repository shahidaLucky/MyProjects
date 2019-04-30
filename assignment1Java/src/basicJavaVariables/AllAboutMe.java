package basicJavaVariables;
//1. All about me

public class AllAboutMe {

	public static void main(String[] args) {
//Declaring variables
		String name= "Shahida";
		int age=31;
		int height=175;
		String eyes = "Black";
		String teeth = "White";
		String hair = "Black";
//output		
		System.out.println("Let's talk about "+name+"." + '\n' + "They're "+height+ " inches tall." + '\n' + "They're "+age+ " years old." 
	    + '\n' + "Huh, that's older than I expected..." + '\n' + "They have "+eyes+ " eyes and " +hair+ " hair." + '\n' +
	   "Their teeth are usually "+teeth+ ", but it depends on the coffee." + '\n' + "Alright, this is pretty boring. Let's stop talking about " +name+".");
//Converting height to cm's
		double heightCm = height*2.54;
        System.out.println("175 inches is :" +heightCm+ "cm");    
	}

}
