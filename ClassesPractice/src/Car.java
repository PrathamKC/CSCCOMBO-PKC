public class Car {
	private String color;
	private int mileage;
	private double amtOfGas;
	
	private Wheel[] wheels;
	private SteeringWheel sWheels;
	//private SteeringWheel[] sWheel;
	
	//Constructors
	public Car() {
		color = "white";
		mileage = 1000;
		amtOfGas = 30.0;
		int numWheels = 4;
		int stWheel = 1;
		wheels = new Wheel[numWheels];
		sWheels = new SteeringWheel(22, "woods");
		setWheels(22, "wood");
		
		//sWheel = new SteeringWheel[stWheel];
		//setSWheel(12, "leather");
	}
		
	public Car(String color, int mileage, double amtOfGas, int numWheels, int stWheel) {
		this.color = color;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
		wheels = new Wheel[numWheels];	
		
		//sWheel = new SteeringWheel[stWheel];
		//this.sWheels = stWheel;
		
	}
//	public SteeringWheel getSWheels()
//	{
//		return sWheels;
//	}
	
	public Wheel[] getWheels() {
		return wheels;
	}
	
//	public SteeringWheel[] getSWheel()
//	{
//		return sWheel;
//	}
//	
//	public void setSWheel(int radius, String material)
//	{
//		for(int i = 0; i < sWheel.length; i++) 
//		{
//			sWheel[i] = new SteeringWheel(radius,material);
//		}
//	}
//	
	public void setWheels(int radius, String material) {
		for(int i = 0; i < wheels.length; i++) 
		{
			wheels[i] = new Wheel(radius,material);
		}
	}

	//Accessors/Getters
	public String getColor() {
		return color;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public double getGas() {
		return amtOfGas;
	}
	
	//Setters/Mutators
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setamtOfGas(double amtOfGas)
	{
		this.amtOfGas = amtOfGas;
	}
	
	public void drive(int milesDriven)
	{
		mileage += milesDriven;
		amtOfGas -= milesDriven/17;
	}
	
	public String toString()
	{
		//Wheel[] wls = getWheels();
		
		String str = "The cars color: " + this.color
				+ ". The mileage is: " + this.mileage
				+ ". The gas amt is: " + this.amtOfGas + " "
				+ wheels[0] + " "
				+ sWheels;
		
		return str;
	}
}