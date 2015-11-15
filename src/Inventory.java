import java.util.ArrayList;

public class Inventory{
	
	private double maxWeight;
	private ArrayList<ItemSlot> slots;
	private boolean maxCapacity;
	private static final double DEFAULT_MAX_WEIGHT = 50;

	//Constructors
	public Inventory(){
		this(DEFAULT_MAX_WEIGHT, false);
	}
	
	public Inventory(double mw, boolean mc){
		maxWeight = mw;
		maxCapacity = mc;
		slots = new ArrayList<ItemSlot>();
	}

	//Other Methods
	
	public boolean pickUp(Item i){
		if (i.getWeight() + getWeight() <= maxWeight){
			slots.add(i);
			return true;
		}else{
			return false;
		}
	}

	public Item drop(int index){
		if (index < slots.size()){
			Item discardable = slots.get(index);
			slots.remove(index);
			return discardable;
		}
		return null;
	}
	
	//Getters and Setters
	public double getMaxWeight(){
		return maxWeight;
	}
	
	public boolean setMaxWeight(double mw){
		if (mw >= getWeight()) {
			maxWeight = mw;
			return true;
		} else
			return false;
	}
	
	public double getWeight(){
		double weight = 0;
		for (int i = 0; i < slots.size; i++)){
			weight += slots.get(i).getWeight();
		}
		return weight;
	}

	public boolean hasMaxCapacity(){
		return maxCapacity;
	}

	public void increaseMaxWeight(double weight) {
		maxWeight += weight;
	}

	public boolean decreaseMaxWeight(double weight){
		if (maxWeight - weight >= getWeight()){
			maxWeight -= weight;
			return true;
		}else{
			return false;
		}
	}
	
}