package com.form;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEg extends JFrame implements MouseListener{
	JLabel l;
	
	public MouseListenerEg() {
		
		addMouseListener(this);
		l= new JLabel("Hello");
		add(l);
		setSize(400,400);
		
		setVisible(true);

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse clicked");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse exited");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse released");
		
	}
	public static void main(String[] args){
		new MouseListenerEg();
	}
	

}
