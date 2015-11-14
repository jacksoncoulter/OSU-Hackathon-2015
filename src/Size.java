
public class Size {

	private int width;
	private int height;
	
	// If no width or height is provided, then it is assumed to be 
	// a 20x20 size
	public Size() {
		width = 20;
		height = 20;
	}
	
	// Creates a size with the provided width and height. If the width or
	// the height is not a multiple of 20, the value is rounded up to the 
	// nearest multiple of 20.
	public Size(int width, int height) {		
		
		if (width % 20 != 0) {
			width = width + (20 - (width % 20));
		}
		
		if (height % 20 != 0) {
			height = height + (20 - (height % 20));
		}
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
}
