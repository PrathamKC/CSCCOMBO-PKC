public class Cat extends Animal {
	private String color;
	
	public Cat(double length, double height, String color) {
		super(length, height);
		this.color = color;
	
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String makeNoise() {
		return "Meow Meow Meow";
	}
	
	@Override
	public String toString() {
		return "Cat";
	}
}