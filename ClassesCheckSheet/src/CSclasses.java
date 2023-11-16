import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CSclasses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int type = 0;
		
		Course h = new Course();
	
		
//		******** Sets ArrayList	******** 
		List<Course> courseList = new ArrayList<>();

//		********  Sets classes	******** 
		Course person = new InPersonCourse("csc1060",5,4,3,119);
		Course fullRemote = new FullRemoteCourse("csc1060",5,4,3,"123@gmail.com", "emailCourseContact");
		Course realTime = new RealTimeRemoteCourse("csc1060",5,4,3,"123@gmail.com", "zoomInfo");
		
//		******** Adds classes to the ArrayList	******** 
		courseList.add(person);
		courseList.add(fullRemote);
		courseList.add(realTime);
		
//		******** Methods	******** 
		withToString(fullRemote);
		Course tempCourse = courseList.get(0);
		noToString(tempCourse);

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