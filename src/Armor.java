
public class Armor extends Item{
	
	private int level;
	private int defense;
	
	//Constructors
	public Armor(){
		this("Nakey", 1.0, 1, 1, 10);
	}
	
	public Armor(String name, double weight, int value, int level, int defense){
		super(name, weight, value);
		this.level = level;
		this.defense = defense;
	}
	
	//Getters and Setters
	
	public int getDefense(){
		return this.defense;
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public boolean setDefense(int defense){
		if (defense < 0){
			this.defense = defense;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean setLevel(int level){
		if (level >= 1){
			this.level = level;
			return true;
		}else{
			return false;
		}
	}
}