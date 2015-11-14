
public class Direction {

	public final int NORTH = 0;
	public final int WEST = 1;
	public final int EAST = 2;
	public final int SOUTH = 3;
	
	private int direction;
	
	public Direction() {
		direction = NORTH;
	}
	
	public Direction(int direction) {
		this.direction = direction;
	}
}
