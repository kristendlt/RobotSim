package Simulation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	public MainFrame() {
	}
	

	/**
	 * java requires you to have many things set for your window before it displays it
	 * setSize(int width, int height) required
	 * setTitle() optional
	 * setDefaultCLoseOperation(operation) required
	 * setVisible(boolean) required
	 */
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(700, 700);
		window.setTitle("Robot simulation");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		Drawing D = new Drawing();
		//the only way we can get this Rectangle to appear on our JFrame is to use a Jcomponent
		//we need to draw the rectangle onto the Jcomponent and then add it to the JFrame, so i created drawing class
		window.add(D);
		
		
		
		
	}
	
	
	
		
	
	}