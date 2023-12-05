public class Course 
{
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private String emailCourseContact;
	
	public Course() {
		super();
	}

	public Course(String courseNumber, int numStudents, int maxStudents, int credits) {
		super();
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getEmailCourseContact() {
		return emailCourseContact;
	}

	public void setEmailCourseContact(String emailCourseContact) {
		this.emailCourseContact = emailCourseContact;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String dbString() {
		return "Course " + "," + numStudents + "," + maxStudents + "," + credits + ",";
	}

	@Override
	public String toString() {
		return "Course: " + courseNumber 
				+ "\nNumber of Students:" + numStudents 
				+ "\nMax number of Students: " + maxStudents
				+ "\nCredits: " + credits;
	}
}