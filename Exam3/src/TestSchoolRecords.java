import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<>();
	
		Person student1 = new Student("Bob", "123 he Dr", "123-333-111", "gmail", "Freshman");
		peopleList.add(student1);
		
		Person student2 = new Student("Ross", "321 eh Rd", "111-222-333", "ymail", "Senior");
		peopleList.add(student2);
	
		Person faculty1 = new Faculty ("Rex", "111 ss DD", "222-333-444", "hmail", "Room 111", 123337, "01-01-01", "9-5", "Junior");
		peopleList.add(faculty1);
		
		Person faculty2 = new Faculty ("Tex", "123 he Dr", "123-333-111", "zmail", "Room 102", 112333, "01-01-02", "9-6", "Senior");
		peopleList.add(faculty2);
		
		Person staff1 = new Staff ("Dex", "12 fus ro", "678-999-8212", "tmail", "Room 101", 123333, "01-01-00", "Senior");
		peopleList.add(staff1);
		
		Person staff2 = new Staff ("Fex", "12 dah", "222-332-1112", "hmail", "Room 100", 123333, "01-01-00", "Senior");
		peopleList.add(staff2);
		
		printer(staff1);
		
		for (int i = 0; i < peopleList.size(); i++) {
			printer(peopleList.get(i));
			System.out.println();
		}
	}
	
	public static void printer(Person person) {
		System.out.println(person.toString());
	}
}
