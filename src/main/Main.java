package main;

import javax.swing.*;
import plane.Plane;
import java.awt.*;

public class Main extends JFrame {

	public Main() {
		super("Testing the Plane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		
		Plane plane = new Plane();
		add(plane, BorderLayout.CENTER);
		
		// Set desired scale for the plane
		plane.setScaleInX(1);
		plane.setScaleInY(1);
		
		// Enable grid in plane
		plane.setShowGrid(true);
		
		// Enable axis in plane
		plane.setShowAxis(true);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}
}
