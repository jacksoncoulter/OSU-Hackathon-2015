
public class Chest extends WorldObject {
	private Inventory inventory;
	
	public Chest(){
		this.size = new Size();
		this.location = new Location();
		this.collidable = true;
		this.interactable = true;
		inventory = new Inventory();
	}
	
	public Chest(Location l, Size s, boolean collide, boolean interact, Inventory inven){
		this.location = l;
		this.size = s;
		this.collidable = collide;
		this.interactable = interact;
		this.inventory = inven;
	}
}
