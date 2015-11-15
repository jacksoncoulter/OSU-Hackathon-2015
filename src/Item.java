public class Item{
	
	private String name;
	private double weight;
	private int value;
	
	//Constructors
	public Item(){
		this("Rock", 1.0, 1);
	}
	
	public Item(String name, double weight, int value){
		this.name = name;
		this.weight = weight;
		this.value = value;
	}
	
	//Getters and Setters
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		if (!s.equals("")){
			name = s;
		}
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double w){
		if (w >= 0){
			weight = w;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int v){
		if (v >= 0){
			value = v;
		}
	}
}