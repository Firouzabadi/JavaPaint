package Shape;

public class Circle extends Shape {


	public Circle(int xStart, int yStart, int xEnd, int yEnd, String color, int user_id) {
		super(xStart, yStart, xEnd, yEnd, color, user_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		// Graphics: drawOval(int x, int y, int width, int height)
		super.getGraphics().drawOval(super.getxStart(), super.getyStart(), super.getWidth(), super.getHeight());
	}
}
