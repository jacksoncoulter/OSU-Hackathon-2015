
public class Weapon extends Item{
	
	protected Skill skillType;
	protected int damage;
	protected double weaponLength;
	protected double weaponWidth;
	protected double attackLength;
	protected double attackDelay;

	//Constructors
	public Weapon() {
		this("Short Sword", 1.0, 3, new Skill("Swords", 1, 0), 10, 2.0, 1.0, 0.75, 0.5);
	}

	public Weapon(String name, double weight, int value, Skill type, int dam, double length, double width, double attLeng,
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
		if (wl >= 0){
			weaponLength = wl;
			return true;
		}else{
			return false;
		}
	}

	public boolean setWeaponWidth(double ww) {
		if (ww >= 0){
			weaponWidth = ww;
			return true;
		}
		return false;
	}

	public boolean setAttackLength(double al) {
		if (al >= 0){
			attackLength = al;
			return true;
		}
		return false;
	}

	public boolean setAttackDelay(double ad) {
		if (ad >= 0){
			attackDelay = ad;
			return true;
		}
		return false;
	}

}
