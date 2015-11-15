import "Item.java";
import java.util.*;

public class ItemSlot{
	
	private Item storedItem;
	private int count;
	private boolean stackable;
	private int maxStackSize;
	private int DEFAULT_MAX_STACK_SIZE;
	
	//Constructors
	public ItemSlot(){
		this(null, false);
	}
	
	public ItemSlot(Item i, boolean stackable){
		ItemSlot (i, stackable, 1)
	}
	
	public ItemSlot (Item i, boolean stackable, int count){
		storedItem = i;
		this.stackable = stackable;
		this.count = count;
		maxStackSize = DEFAULT_MAX_STACK_SIZE;
	}

	//Other methods
	public boolean incrementStack(){
		if (stackable && count < maxStackSize){
			count++;
			return true;
		}else{
			return false;
		}
	}

	//Getters and Setters
	public String getItemName(){
		return storedItem.getName();
	}
	
	public int getCount(){
		return count;
	}
	
	public boolean getStackable(){
		return stackable;
	}
	
	public double getWeight(){
		return storedItem.weight * count;
	}
	
	public boolean setMaxStackSize(int size){
		if (size >= maxStackSize){
			maxStackSize = size;
			return true;
		}
		return false;
	}
	
}