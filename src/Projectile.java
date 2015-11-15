
public class Projectile {
	
	private Location location;
	private Location origin;
	private Size size;
	private float speedX;
	private float speedY;
	private float maxDistance;
	private float currentDistance;
	
	public Projectile() {
		location = new Location(0, 0, 0.0f);
		size = new Size();
		speedX = 1.0f;
		speedY = 1.0f;
	}
	
	public Projectile(Location location, Size size, float speedX, float speedY, float maxDistance) {
		this.location = location;
		this.origin = this.location;
		this.size = size;
		this.speedX = speedX;
		this.speedY = speedY;
		this.maxDistance = maxDistance;
		this.currentDistance = 0.0f;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Direction getDirection() {
		return location.getDirection();
	}
	
	public float getSpeedX() {
		return speedX;
	}
	
	public float getSpeedY() {
		return speedY;
	}
	
	private float getDistanceTraveled() {
		float x = location.getCoordinateX() - origin.getCoordinateX();
		float y = location.getCoordinateY() - origin.getCoordinateY();
		return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

}
