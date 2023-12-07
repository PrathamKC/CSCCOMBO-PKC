import java.util.Random;

public class Die {
	private int numSides;
	private int value;
	
	public Die(int numSides, int value) {
		super();
		this.numSides = numSides;
		numSides = 6;
		
		this.value = value;
		value = 1;
	}

	public int getNumSides() {
		return numSides;
	}


	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		this.value = 1;
	}
	
	public int roll() {
		Random ran = new Random();
		value = ran.nextInt(1,numSides);
		return value;
		
	}

	@Override
	public String toString() {
		return "Die numSides: " + numSides +
				"\nValue:" + value;
	}
}
