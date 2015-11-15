import java.awt.Point;

public class Location {

	private Point coordinates;
	private Direction direction;
	
	public Location() {
		coordinates = new Point(0, 0);
		direction = new Direction();
	}
	
	public Location(Point p) {
		coordinates = new Point(p.x, p.y);
		direction = new Direction();
	}
	
	public Location(int x, int y) {
		coordinates = new Point(x, y);
		direction = new Direction();
	}
	
	public Location(Point p, Direction d) {
		coordinates = new Point(p.x, p.y);
		direction = new Direction(d);
	}
	
}
