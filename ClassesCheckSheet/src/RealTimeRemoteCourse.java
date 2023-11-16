public class RealTimeRemoteCourse extends OnlineCourse {
	private String zoomInfo;

	public RealTimeRemoteCourse() {
		super();
	}
	
	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String email, String zoomInfo) {
		super(courseNumber, numStudents, maxStudents, credits, email);
		this.zoomInfo = zoomInfo;
	}
	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}

	@Override
	public String toString() {
		return super.toString() +
				 "\nReal Time Remote Course Zoom Info: " + zoomInfo;
	}	
}