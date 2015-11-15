public class Item{
	
	private String name;
	private double weight;
	private int value;
	
	public Item(){
		this("Rock", 1.0, 1);
	}
	
	public Item(String name, double weight, int value){
		this.name = name;
		this.weight = weight;
		this.value = value;
	}
	
}