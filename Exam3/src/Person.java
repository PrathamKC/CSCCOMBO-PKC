
public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	
	public String getName() {
		return name;
	}
	
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Name: " + name +
				"\nAddress: " + address +
				 "\nPhone #: " + phoneNumber +
				 "\nEmail: " + emailAddress;
	}
	
	
}
