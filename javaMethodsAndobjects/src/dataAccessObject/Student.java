package dataAccessObject;

public class Student {

	private String name;
	private int rollNo;
	
	public Student(String name, int rollNo) {
		
		this.name = name;
		this.rollNo = rollNo;
	}
	/**
	 * @return the nameString
	 */
	public String getNameString() {
		return name;
	}
	/**
	 * @param nameString the nameString to set
	 */
	public void setNameString(String name) {
		this.name = name;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}

//----------------------------------------------
