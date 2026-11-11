package cs101;

import java.awt.Color;
import java.awt.Graphics2D;

public class Square implements Canvas.Drawable {
	// instance variables

	// constructor

	// methods

	// do not modify
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.width);
	}
}