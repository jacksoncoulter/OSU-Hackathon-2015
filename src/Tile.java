
public abstract class Tile {

	protected Location location;
	protected Size size;
	protected boolean collidable;
	protected boolean interactable;

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

	public abstract void draw();

	public abstract void interact();

}
