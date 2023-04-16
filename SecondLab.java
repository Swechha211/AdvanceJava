package com.form;
import javax.swing.JButton;
import javax.swing.JFrame;
public class SecondLab extends JFrame{
	JButton b;
	
	SecondLab()
	{
		b = new JButton("click me");
		add(b);
		b.setBounds(40,50,160,100);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		
		
	}
	public static void main(String[] args)
	{
		new SecondLab();
		
		
	}
}
