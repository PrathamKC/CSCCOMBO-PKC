public class FullRemoteCourse extends OnlineCourse {
	private String emailCourseContact;

	public FullRemoteCourse() {
		super();
	}
	

	public FullRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String email, String emailCourseContact) {
		super(courseNumber, numStudents, maxStudents, credits, email);
		this.emailCourseContact = emailCourseContact;
	}

	public void setEmailCourseContact(String emailCourseContact) {
		this.emailCourseContact = emailCourseContact;
	}
	
	public String getEmailCourseContact() {
		return emailCourseContact;
	}
	
	public String dbString() {
		return "FullRemoteCourse" + "," + getCourseNumber()  + "," + getNumStudents() +
				"," + getMaxStudents() + "," + getCredits() + "," + getEmail() + "," +  emailCourseContact;
	}
	
	@Override
	public String toString() {
		return super.toString()  +
				 "\nFull remote course email course contact: " + emailCourseContact;
	}
	
}