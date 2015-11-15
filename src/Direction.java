public class Direction {
	
	private float direction;
	
	public Direction() {
		direction = 0.0f;
	}
	
	public Direction(float direction) {
		this.direction = direction;
	}
	
	public Direction(Direction other) {
		this.direction = other.direction;
	}
	
	public float getDirection() {
		return direction;
	}
	
	public void setDirection(int direction) {
		this.direction = direction;
	}
}
