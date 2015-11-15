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
	
	public boolean pickUp(Item query){
		return pickUp(query, 0);
	}
	
	private boolean pickUp(Item query, int pos){
		if (!query.getStackable()){
			if (query.getWeight() + getWeight() <= maxWeight){
				slots.add(new ItemSlot(query, true));
				return true;
			}else{
				return false;
			}
		}
		for (int i = pos; i < slots.size(); i++){
			if (query.getName().equals(slots.get(i).getItemName())){
				if (!slots.get(i).incrementStack()){
					pickUp(query, pos+1);
				}else{
					return true;
				}
			}
			
		}
		slots.add(new ItemSlot(query, true));
		return true;
	}

	public Item drop(int index){
		if (index < slots.size()){
			ItemSlot discardable = slots.get(index);
			slots.remove(index);
			return discardable.getItem();
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
		for (int i = 0; i < slots.size(); i++){
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