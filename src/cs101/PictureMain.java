package cs101;

import java.awt.Color;

public class PictureMain {
	public static void main(String[] args) {
		// do not modify this line
		Canvas canvas = new Canvas("CS101 Picture", 800, 600); // picture is 800 x 600
		// remember, right/down is positive, left/up is negative

		// Sky/Background
		Square sky = new Square(800); // 800 x 800 square
		Color myBlue = new Color(135, 206, 235); // color can be chosen with RGB color picker
		sky.setColor(myBlue);

		// Grass
		Square ground = new Square(800); // 800 x 800 square
		ground.setColor(new Color(34, 139, 34)); // green
		ground.move(0, 500); // move grass down

		// Sun in upper corner
		Circle sun = new Circle(100); // diameter is 100
		sun.setColor(Color.PINK); // you can also use a premade color
		sun.move(300, -200); // move sun 300 to the right and 200 up

		// add everything to picture in the right order
		canvas.addShape(sky); // base
		canvas.addShape(ground);
		canvas.addShape(sun); // top

	}
}