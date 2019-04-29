package jpa.entitymodels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Course {

	@Id
	@Column(name = "id")
	private int cId;

	@Column(name = "name")
	private String cName;

	@Column(name = "instructor")
	private String cInstructorName;

	private List<Course> sCourses;

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cInstructorName=" + cInstructorName + "]";
	}

	public Course() {
		this.cId = 0;
		this.cName = "defaultName";
		// this.sCourses
	}

	public Course(int cId, String cName, String cInstructor, List<Course> sCourses) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
		this.sCourses = sCourses;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructor() {
		return cInstructorName;
	}

	public void setcInstructor(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

}
