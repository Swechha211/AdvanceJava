package com.form;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Adapterdemo extends MouseAdapter{
	
	JFrame f;
	
	public Adapterdemo() {
		f = new JFrame();
		f.addMouseListener(this);
		f.setSize(400,400);
		f.setVisible(true);
		
	}
	public void mouseClicked(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		System.out.println("Coordinates are "+ x+ ","+ y );
	}
	
	
	

	public static void main(String[] args){
		new Adapterdemo();
		
	}

}
