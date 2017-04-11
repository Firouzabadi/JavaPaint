package Shape;

import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle(int xStart, int yStart, int width, int height, String color, int user_id) {
		super(xStart, yStart, width, height, color, user_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		// Graphics: drawRect(x, y, width, height)

		g.drawRect(super.getxStart(),super.getyStart(), super.getWidth(), super.getHeight());
	}
}
