package cs101;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle implements Canvas.Drawable {
	// instance variables

	// constructor

	// methods

	@Override
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		int x = this.x - this.radius;
		int y = this.x - this.radius;
		int diameter = this.radius * 2;
		g.fillOval(x, y, diameter, diameter);
	}
}