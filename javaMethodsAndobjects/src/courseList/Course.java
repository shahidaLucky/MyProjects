package courseList;

public class Course {

	private int courseId;
	private String courseName;
	private String instructorName;

	/**
	 * @return the instructorName
	 */
	public String getInstructorName() {
		return instructorName;
	}

	public Course(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
//Default Constructor to create the object of the class
	public Course() {

	}

	int getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId + 99;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName + "Basic";
	}

	/**
	 * @param courseName the courseName to set
	 */ 
	//setting instructorName according to the courseName 
	public void setCourseName(String courseName) {
		this.courseName = courseName;
		if (this.courseName.equals("Java")) {
			this.instructorName = "Shahparan";
		} else if (this.courseName.equals("Python")) {
			this.instructorName = "Young";
		}

	}

	private void printCourseDetails() {
		System.out.println(getCourseId());
		System.out.println(getCourseName());
		System.out.println(getInstructorName());
	}

	void publicPrinter() {
		printCourseDetails();
	}

}
