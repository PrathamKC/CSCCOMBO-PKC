public class Animal {
	private double length;
	private double height;
	
	
	public Animal(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//methods go after constructors and before the to string
	public String makeNoise() {
		return "Blah Blah Blah";
	}
	public String makeNoise(String noise) {
		return noise + " " + noise + " " + noise;
	}
	
	public boolean equals(Animal animal) {
		if(this.length == animal.length && this.height == animal.height) 
		{	
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Animal";
	}
}