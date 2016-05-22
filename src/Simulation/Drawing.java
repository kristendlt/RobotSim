package Simulation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Drawing extends JComponent {
	private static final Graphics2D Graphics2D = null;
	static Line2D line;
	static Random rn = new Random();
	private int x;
	private int y;
	private int maxDistance;
	private int angle;
	private int height;
	private int length;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle rect1 = new Rectangle(20, 20, 500, 300);
		g2.draw(rect1);
		int i = 0;
		y = rn.nextInt(301) + 20;
		x = rn.nextInt(501) + 20;
		maxDistance = Drawing.calcMaxDistance(300, 500);

		do {

			int randomDistance = rn.nextInt(maxDistance + 1);
			angle = (int) (Math.random() * 360);

			Point2D next = getNextCoordinate(x, y, randomDistance, angle);

			line = new Line2D.Double(x, y, next.x, next.y);

			if (next.x >= 20 && next.x <= 520 && next.y >= 20 && next.y <= 320) {
				g2.draw(line);
				x = next.x;
				y = next.y;
			}

		} while (i++ < 2_000);

	}

	public static int calcMaxDistance(int height, int length) {
		int hyp = (int) Math.hypot(length, height);
		return hyp;

	}

	public Point2D getNextCoordinate(int xCoordinate, int yCoordinate, int distance, int angle) {
		x = xCoordinate;
		y = yCoordinate;
		int nextx = x + (int) (distance * Math.cos(Math.toRadians(angle)));
		int nexty = y + (int) (distance * Math.sin(Math.toRadians(angle)));
		Point2D points = new Point2D(nextx, nexty);
		return points;
	}

}
