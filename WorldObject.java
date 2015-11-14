
public abstract class WorldObject {

	private Location location;
	private Size size;
	private boolean collidable;
	private boolean interactable;
	
	public Location getLocation() {
		return this.location;
	}
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size s) {
		size = s;
	}
	
	public boolean canCollide() {
		return collidable;
	}
	
	public boolean canInteract() {
		return interactable;
	}
	
}
