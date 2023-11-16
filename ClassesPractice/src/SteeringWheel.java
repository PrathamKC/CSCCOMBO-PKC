public class SteeringWheel 
{
	private int radius;
	private String material;

	public SteeringWheel(int radius2, String material2) {
			this.material = material2;
			this.radius = radius2;
	}

	public int getRadius() 
	{
		return radius;
	}
	
	public String getMaterial()
	{
		return material;
	}

	@Override
	public String toString() {
		return "Steering Wheel Radius: " + radius + " Steering Wheel Material: " + material;
	}
}