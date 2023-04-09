package com.form;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class XyMouselistener extends JFrame implements MouseListener{
	JPanel panel;
	JLabel label;
	public XyMouselistener() {
		    panel = new JPanel();
	        label = new JLabel(" Coordinates");
	        panel.add(label);
	        panel.addMouseListener(this);
	        add(panel);
	        setTitle("Mouse Coordinate Tracker");
	        setSize(400, 400);
	       
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Coordinates: (" + e.getX() + ", " + e.getY() + ")");
//		System.out.println("Coordinates are "+ e.getX()+ ","+ e.getY() );
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args){
		new XyMouselistener();
	}
	

}
