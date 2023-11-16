public class Person 
{
	private String fName;
	private String lName;
	private int age;
	private double height;
	private int feet;
	private int inches;
	private Car newCar;
	
	public Person() {	
	}

	public Car getNewCar() {
		return newCar;
	}

	public void setNewCar(Car newCar) {
		this.newCar = newCar;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public Person(String firstName, String lastName, int age, double height)
	{
		fName = firstName;
		this.lName = lastName;
		this.age = age;
		this.height = height;
		newCar = new Car();
	}

	@Override
	public String toString() {
		String str = "First Name: " + this.fName 
				+ " Last Name: " + this.lName
				+ " Age: " + this.age
				+ " Height: " + this.height;
		return str;
	}
}