package courseList;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling by c1 object: ");
		Course c1 = new Course();
		
		c1.setCourseId(1);
		c1.setCourseName("Java");
		c1.getInstructorName();
		
		c1.publicPrinter();
		
		System.out.println("Calling by c2 object: ");
		Course c2 = new Course();
		c2.setCourseId(2);
		c2.setCourseName("Python");
		c2.publicPrinter();

	}

}
