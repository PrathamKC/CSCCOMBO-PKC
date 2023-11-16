public class RangedWpn extends Weapon
{
	private int Range;

	public RangedWpn() {
		super();
	}

	public RangedWpn(String name, int damage, int range) {
		super(name, damage);
		this.Range = range;
	}

	@Override
	public String toString() {
		return "RangedWpn [Range=" + Range + "]";
	}
	
	
}
