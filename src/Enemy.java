
public class Enemy {
	private String name;
	private Location location;
	private Direction direction;
	private Weapon weapon;
	private Armor armor;
	private boolean tracking = false;
	private Stats stat = new Stats();
	
	public Enemy() {
		name = "Emanon";
		location = new Location();
		direction = new Direction(167.0f);
		weapon = new Weapon();
		armor = new Armor();
	}
	
	public Enemy(String name, Location loc, Direction direct, Weapon weapon, Armor armor, boolean track, Stats stat){
		this.name = name;
		this.location = loc;
		this.direction = direct;
		this.weapon = weapon;
		this.armor = armor;
		this.tracking = track;
		this.stat = stat;
	}
	
	public Location getLocation(){
		return location;
	}
	
	public Direction getDirection(){
		return direction;
	}
	
	public Weapon getWeapon(){
		return weapon;
	}
	
	public Armor getArmor(){
		return armor;
	}
	
	public boolean getTracking(){
		return tracking;
	}
	
	public Stats getStats(){
		return stat;
	}
	
	public boolean setLocation(Location l){
		location = l;
		return true;
	}
	
	public boolean setDirection(int d){
		direction.setDirection(d);
		return true;
	}
	
	public boolean setWeapon(Weapon w){
		weapon = w;
		return true;
	}
	
	public boolean setArmor(Armor a){
		armor = a;
		return true;
	}
	
	public boolean setTracking(boolean b){
		tracking = b;
		return true;
	}
	
	public boolean setStats(Stats st){
		stat = st;
		return true;
	}
	
	//lowers enemy health
	public void takeDamage(int i){
		stat.setSkillCurrentValue(6, stat.getSkillCurrentValue(6)-i);
	}
	
	//checks if enemy is dead
	public boolean isDead(){
		if (stat.getSkillCurrentValue(6)<=0){
			return true;
		}
		return false;
	}
	
	//randomly changes direction of enemy
	public void changeDirection(){
		direction.setDirection((int)Math.random()*360);
	}
	
	//checks to see if the player is in tracking range. If so, starting tracking. If they are already tracking
	//the player, they get a boost to their tracking range until they lose the player, at which point it
	//returns to it's normal size;
	public boolean isTracking(Location loc){
		float x = location.getCoordinateX() - loc.getCoordinateX();
		float y = location.getCoordinateY() - loc.getCoordinateY();	
		if ((float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))>10){
			return true;
		}
		if ((float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))<30 && tracking==true){
		return true;
		}
		
		return false;
	}
	
	
}
