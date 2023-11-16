public class Dog extends Animal {
	private boolean drool;
	
	public Dog(double length, double height, boolean drool) 
	{
		super(length, height);
		this.drool = drool;
	}
	
	@Override
	public String makeNoise() {
		return "Woof Woof Woof";
	}
	
	@Override
	public String toString() {
		return "Dog";
	}
}