
public class Weapon {
	protected String name;
	protected Skill skillType;
	protected int damage;
	protected double weight;
	protected double weaponLength;
	protected double weaponWidth;
	protected double attackLength;
	protected double attackDelay;
	
	public Weapon(){
		name = "Short Sword";
		skillType = new Skill("Swords", 1,0);
		damage = 10;
		weight = 1.0;
		weaponLength = 2.0;
		weaponWidth = 1.0;
		attackLength = 0.75;
		attackDelay = 0.5;		
	}

	public Weapon(String name, Skill type, int dam, double weight, double length, double width, double attLeng, double attDelay){
		this.name = name;
		this.skillType = type;
		this.damage = dam;
		this.weight = weight;
		this.weaponLength = length;
		this.weaponWidth = width;
		this.attackLength = attLeng;
		this.attackDelay = attDelay;
	}
	
	public String getName(){
		return name;
	}
	
	public Skill getType(){
		return skillType;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getWeaponLength(){
		return weaponLength;
	}
	
	public double getWeaponWidth(){
		return weaponWidth;
	}
	
	public double getAttackLength(){
		return attackLength;
	}
	
	public double getAttackDelay(){
		return attackDelay;
	}
	
	public boolean setDamage(int value){
		damage = value;
		return true;
	}
	
	public boolean setWeight(double value){
		weight = value;
		return true;
	}
	
	public boolean setWeaponLength(double value){
		weaponLength = value;
		return true;
	}
	
	public boolean setWeaponWidth(double value){
		weaponWidth = value;
		return true;
	}
	
	public boolean setAttackLength(double value){
		attackLength = value;
		return true;
	}
	
	public boolean setAttackDelay(double value){
		attackDelay = value;
		return true;
	}
	
}
