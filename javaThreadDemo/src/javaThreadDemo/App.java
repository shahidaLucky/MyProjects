package javaThreadDemo;

/*class MyTask{
	void executableTask() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("@@  Printing Document # " +doc+" -  Printer---2" );
		}
	}
	
}*/

//MyTask IS-A Thread
class MyTask extends Thread{
	@Override
	public void run() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("@@  Printing Document # " +doc+" -  Printer---2" );
		}
	}
	
}

public class App {

	//main method represents main thread
	public static void main(String[] args) {
		//whatever we write in here will be executed by main thread
		//thread always execute the jobs in a sequence 
	//Execution Context	
		
		//job--1
		System.out.println("===Application started===");
		
		//job--2
		MyTask task = new MyTask();
		//task.executableTask();
		task.start();// start shall internally execute run method
		
// Till job2 is not finished, below written jobs are waiting and are not executed  
// In case job2 is a long running operation, i.e several documents are supposed to be printed		
// In such a use case OS/JVM shall give a message that App is not responding 
// some slavish behaviour in APP can be observed --> App seems hang		
		//job--3
		//some code to print the document
		for(int doc=1; doc<=10; doc++) {
			System.out.println(" ^^ printing document  # " +doc+ " - Printer--1");
		}
		
		//job--4
		System.out.println("===Application finished===");
	}

}
