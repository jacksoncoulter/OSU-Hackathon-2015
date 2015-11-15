public class Armor{
	private String name;
	private double weight;
	private int level;
	private int defense;
	
	
	public Armor(String name, double weight, int level, int defense){
		this.name = name;
		this.weight = weight;
		this.level = level;
		this.defense = defense;
		
	}
	
	public Armor(){
		this("Nakey", 1.0, 1, 10);
		
	}
		
	public String getName(){
		return this.name;
		
	}
	
	public int getDefense(){
		return this.defense;
		
	}
	
	public double getweight(){
		return this.weight;
		
	}
	
	
	public int getLevel(){
		return this.level;
		
	}
	
	public boolean setName(String name){
		this.name = name;
		return true;
	}
	
	public boolean setDefense(int defense){
		this.defense = defense;
		return true;
	}
	
	public boolean setWeight(double weight){
		this.weight = weight;
		return true;
	}
	
	public boolean setLevel(int level){
		this.level = level;
		return true;
	}

}




