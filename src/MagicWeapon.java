import java.util.ArrayList;

public class MagicWeapon extends Weapon {

	private int manaCost;
	private ArrayList<Projectile> projectiles;

	public MagicWeapon() {
		super("Fire Guantlet", new Skill("Magic", 1, 0), 5, 5, 20, 20, 0, 5);
		manaCost = 2;
	}

	public MagicWeapon(String name, Skill type, int dam, double weight, double length, double width, double attLeng,
			double attDelay, int manaCost) {
		super(name, type, dam, weight, length, width, attLeng, attDelay);
		this.manaCost = manaCost;
	}
	
	public int getManaCost() {
		return manaCost;
	}
	
	public void setManaCost(int cost) {
		manaCost = cost;
	}
	
	public ArrayList<Projectile> getProjectiles() {
		return projectiles;
	}
	
	public void attack() {
		
	}

}
