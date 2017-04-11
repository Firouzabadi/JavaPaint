package Shape;

import java.awt.Graphics;

public abstract class Shape {
	int xStart;
	int yStart;
	int xEnd;
	int yEnd;
	String Color;
	int shape_iduser;
	int user_id;
	Graphics graphics;
	int width = Math.abs(this.xStart - this.xEnd);
	int height = Math.abs(this.yEnd - this.yStart);


	public Shape() {
		super();
	}

	public Shape(int xStart, int yStart, int xEnd, int yEnd, String color, int user_id) {
		super();
		this.xStart = xStart;
		this.yStart = yStart;
		this.xEnd=xEnd;
		this.yEnd=yEnd;
		Color = color;
		this.user_id = user_id;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getxStart() {
		return xStart;
	}

	public void setxStart(int xStart) {
		this.xStart = xStart;
	}

	public int getyStart() {
		return yStart;
	}

	public void setyStart(int yStart) {
		this.yStart = yStart;
	}

	public int getxEnd() {
		return xEnd;
	}

	public void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}

	public int getyEnd() {
		return yEnd;
	}

	public void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getShape_iduser() {
		return shape_iduser;
	}

	public void setShape_iduser(int shape_iduser) {
		this.shape_iduser = shape_iduser;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Graphics getGraphics() {
		return graphics;
	}

	public void setGraphics(Graphics graphics) {
		this.graphics = graphics;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
