public class Character 
{
	private int health;
	private int damage;
	private double speed;
	private String name;
	
	private Weapon weapon;
	
	public Character () {
		
	}

	public Character(String name,  int damage, int health, double speed) {
		this.health = health;
		this.damage = damage;
		this.speed = speed;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(String name, int damage ) {
		this.weapon = new Weapon(name, damage);
	}

	public double doDamage() {
		double dmg = speed * damage * weapon.getDmg();
		return dmg;
	}
	
	public void recieveDamage(double damage) {
		health -= damage; 
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	@Override
	public String toString() {
		return "Character Name: " + name
				+ "\nHealth: " + health 
				+ "\nStrength: " + damage 
				+ "\nSpeed: " + speed  + "\n" 
				+ weapon + "\n";
	}
}