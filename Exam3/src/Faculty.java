
public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, int salary,
			String dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return  super.toString() + 
				"\nFaculty Office Hours: " + officeHours +
				"\nRank: " + rank ;
	}
}