import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CSclasses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInputInt = 0;
		Course userCourse = new Course();
		
		System.out.println("Course Number: ");
		String courseNumber  = input.next();
		userCourse.setCourseNumber(courseNumber);
		
		System.out.println("Number of Students: ");
		int nS = input.nextInt();
		userCourse.setNumStudents(nS);
		
		System.out.println("Max Students: ");
		int mS = input.nextInt();
		userCourse.setMaxStudents(mS);
		
		System.out.println("Credits: ");
		int cred = input.nextInt();
		userCourse.setCredits(cred);
		
		System.out.println("Email: ");
		String email = input.next();
		userCourse.setEmailCourseContact(email);
	
		System.out.println("In person(1), Full Remote(2), or Real Time Remote Course(3)?");
		userInputInt = input.nextInt();
		
		if (userInputInt == 1)
		{
			System.out.println("Room #: ");
			int room = input.nextInt();
			userCourse = new InPersonCourse(courseNumber, nS, mS, cred, room);
			withToString(userCourse);
		}
		if (userInputInt == 2)
		{
			System.out.println("Email for Course Contact #: ");
			String emailContact = input.next();
			userCourse = new FullRemoteCourse(courseNumber, nS, mS, cred, email, emailContact);
			withToString(userCourse);
		}
		if (userInputInt == 3)
		{
			System.out.println("Zoom Info: ");
			String zoomInfo = input.next();
			userCourse = new RealTimeRemoteCourse(courseNumber, nS, mS, cred, email, zoomInfo);
			withToString(userCourse);
		}
		
		
//		******** Sets ArrayList	******** 
		List<Course> courseList = new ArrayList<>();

//		********  Sets classes	******** 
		//Course person = new InPersonCourse("csc1060",5,4,3,119);
		//Course fullRemote = new FullRemoteCourse("csc1060",5,4,3,"123@gmail.com", "emailCourseContact");
		//Course realTime = new RealTimeRemoteCourse("csc1060",5,4,3,"123@gmail.com", "zoomInfo");
		
//		******** Adds classes to the ArrayList	******** 
		//courseList.add(person);
		//courseList.add(fullRemote);
		//courseList.add(realTime);
		
//		******** Methods	******** 
		//withToString(fullRemote);
		//Course tempCourse = courseList.get(0);
		//noToString(tempCourse);

		for (int i = 0; i < courseList.size(); i++) {
			withToString(courseList.get(i));
		}	 
	}
	
	public static void withToString(Course course) {
		System.out.println(course.toString());
	}
	
	public static void noToString(Course course) {
		System.out.println("Course Number: " + course.getCourseNumber());
		System.out.println("Credits: " + course.getCredits());
		System.out.println("Max Students: " + course.getMaxStudents());
		System.out.println("Num Students: " + course.getNumStudents());
		System.out.println("Class: " + course.getClass());
		
		if(course instanceof FullRemoteCourse) {
			System.out.println("Email: " + course.getEmailCourseContact());
		}
		
		if (course instanceof InPersonCourse) {
			System.out.println("Room: " + ((InPersonCourse) course).getRoomNumber());
		}
		
		if (course instanceof RealTimeRemoteCourse) {
			System.out.println("Room: " + ((RealTimeRemoteCourse) course).getZoomInfo());
		}
	}
}