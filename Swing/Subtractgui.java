package com.form;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Subtractgui extends JFrame implements ActionListener
{
	JButton b;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	
	Subtractgui(){
		l1 = new JLabel("Num 1");
		t1 = new JTextField(10);
		l2 = new JLabel("Num 2");
		t2 = new JTextField(10);
		b = new JButton("Subtract");
		l3 = new JLabel("Result");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		
		b.addActionListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
	}
	
	public static void main(String[] args){
		new Subtractgui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num1, num2, result;
		num1 = Integer.parseInt(t1.getText());
		num2 = Integer.parseInt(t2.getText());
		result = num1 - num2;
		l3.setText(result + "");
		
	}

}
