package com.form;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Twodshape  extends JFrame{
		MyPanel panel;
		public Twodshape(){
			panel = new MyPanel();
			add(panel);
			setVisible(true);
			setSize(400,400);
			
		}
		
		public static void main(String[] args){
			new Twodshape();
		}
	
}

		class MyPanel extends JPanel{
			public MyPanel(){
				
			}
			
			public void paint(Graphics g){
				g.drawString("Hello", 40, 40);
				g.drawRect(130, 30, 100, 50);
				g.fillRect(100, 20, 100, 50);	
				g.drawOval(20, 100, 50, 60);
				g.drawArc(30, 200, 40, 50, 90, 60);
				g.fillArc(30, 160, 40, 50, 180, 40);
				g.setColor(Color.BLUE);
				
				
			}
	
}
