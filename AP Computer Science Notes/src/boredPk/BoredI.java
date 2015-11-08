package boredPk;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BoredI extends JFrame{
	
	int x;
	int y;
	int speed;
	
	public BoredI() {
		setTitle("ballz");
		setSize(500, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(false);
		setVisible(true);
		setFocusable(true);
		pack();
		
		x = 0;
		y = 0;
		speed = 3;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 700);
		g.setColor(Color.black);
		g.fillOval(x, y, 10, 10);
		
	}
	

	public static void main (String[] args) {
		JFrame f = new BoredI();
	}
}
