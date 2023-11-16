public class Weapon 
{
	private String name;
	private int dmg;
	
	public Weapon() {
		super();
	}

	public Weapon(String name, int dmg) {
		this.name = name;
		this.dmg = dmg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	@Override
	public String toString() {
		return "Weapon: " + name 
				+ "\nDamage: " + dmg;
	}
	
	
}
