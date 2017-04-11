package Shape;

import java.awt.Graphics;

public class Line extends Shape {

	public Line(int xStart, int yStart, int xEnd, int yEnd, String color, int user_id) {
		super(xStart, yStart, xEnd, yEnd, color, user_id);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		// Graphics: drawLine(line.x1, line.y1, line.x2, line.y2)
		g.drawLine(super.getxStart(), super.getyStart(), super.getxEnd(), super.getyEnd());
	}
}
