
public class Chest extends Tile {
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

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
}
