public class OnlineCourse extends Course
{
	private String email;

	public OnlineCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlineCourse(String courseNumber, int numStudents, int maxStudents, int credits, String email) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}