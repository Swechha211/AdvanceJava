package com.form;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class Formeg extends JFrame
{
	JButton b;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JRadioButton r1,r2;
	Formeg(){
		l1 = new JLabel("Name :");
		l2 = new JLabel("Faculty :");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		l3 = new JLabel("Gender :");
		r1 = new JRadioButton("Male", true);
		r2 = new JRadioButton("Female");
		b = new JButton("Login");
		
		add(l1);
		
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(r1);
		add(r2);
		add(b);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		
	}
	
	public static void main(String[] args)
	{
	new Formeg();
		
	}

}
