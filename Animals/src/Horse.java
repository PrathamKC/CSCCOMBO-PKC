
public class Horse extends Animal {

	private double speed;
	
	public Horse(double length, double height, double speed) {
		super(length, height);
		this.speed = speed;
	}

	@Override
	public String makeNoise() {
		return "Neigh neigh neigh!";
	}
	
	@Override
	public String toString() {
		return "Horse";
	}
}
