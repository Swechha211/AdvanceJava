package com.form;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstLab {
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		JButton b = new JButton("click me");	
		b.setBounds(40, 90, 100, 50); //x, y, width, height
		f.add(b);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
		
			
	
	}

}
