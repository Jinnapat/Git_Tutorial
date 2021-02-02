package rect;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		if (width < 1) {
			this.width = 1;
		} else {
			this.width = width;
		}
		
		if (height < 1) {
			this.height = 1;
		} else {
			this.height = height;
		}
	}
	
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return this.width * this.height;
	}
}
