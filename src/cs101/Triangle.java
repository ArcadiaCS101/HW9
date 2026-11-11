package cs101;

import java.awt.Color;
import java.awt.Graphics2D;

public class Triangle implements Canvas.Drawable {
	private int x1, y1;
	private int x2, y2;
	private int x3, y3;
	private Color color;

	public Triangle(int sideLength) {
		this.color = Color.BLACK; // default color

		// height of equilateral triangle
		int height = (int) ((Math.sqrt(3) / 2.0) * sideLength);

		this.x1 = 400;
		this.y1 = 300 - (height / 2);

		this.x2 = 400 - (sideLength / 2);
		this.y2 = 300 + (height / 2);

		this.x3 = 400 + (sideLength / 2);
		this.y3 = 300 + (height / 2);
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void move(int dx, int dy) {
		this.x1 += dx;
		this.y1 += dy;
		this.x2 += dx;
		this.y2 += dy;
		this.x3 += dx;
		this.y3 += dy;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		int[] xPoints = { this.x1, this.x2, this.x3 };
		int[] yPoints = { this.y1, this.y2, this.y3 };
		g.fillPolygon(xPoints, yPoints, 3);
	}
}