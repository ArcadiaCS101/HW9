package cs101;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {
	private JFrame frame;
	private List<Drawable> drawables;

	public interface Drawable {
		void draw(Graphics2D g);
	}

	public Canvas(String title, int width, int height) {
		drawables = new ArrayList<>();
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);

		frame.add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void addShape(Drawable drawable) {
		drawables.add(drawable);
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		for (Drawable d : drawables) {
			d.draw(g2d);
		}
	}
}