
public class Weapon extends Item{
	
	protected Skill skillType;
	protected int damage;
	protected double weaponLength;
	protected double weaponWidth;
	protected double attackLength;
	protected double attackDelay;

	//Constructors
	public Weapon() {
		weapon("Short Sword", 1.0, 3, new Skill("Swords", 1, 0), 10, 3.0, 2.0, 1.0, 0.75, 0.5);
	}

	public Weapon(String name, double weight, int value, Skill type, int dam, double weight, double length, double width, double attLeng,
			double attDelay) {
		super(name, weight, value);
		this.skillType = type;
		this.damage = dam;
		this.weaponLength = length;
		this.weaponWidth = width;
		this.attackLength = attLeng;
		this.attackDelay = attDelay;
	}

	//Getters and Setters
	public Skill getType() {
		return skillType;
	}

	public int getDamage() {
		return damage;
	}

	public double getWeaponLength() {
		return weaponLength;
	}

	public double getWeaponWidth() {
		return weaponWidth;
	}

	public double getAttackLength() {
		return attackLength;
	}

	public double getAttackDelay() {
		return attackDelay;
	}

	public boolean setDamage(int value) {
		damage = value;
		return true;
	}

	public boolean setWeaponLength(double wl) {
		weaponLength = wl;
		return true;
	}

	public boolean setWeaponWidth(double ww) {
		weaponWidth = ww;
		return true;
	}

	public boolean setAttackLength(double al) {
		attackLength = al;
		return true;
	}

	public boolean setAttackDelay(double ad) {
		attackDelay = ad;
		return true;
	}

}
