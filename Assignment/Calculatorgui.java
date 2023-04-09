package com.form;

import java.awt.FlowLayout;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculatorgui extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	
	Calculatorgui()
	{
		l1 = new JLabel("Num1");
		t1 = new JTextField(10);
		l2 = new JLabel("Num2");
		t2 = new JTextField(10);
		b1 = new JButton("Add");
		b2 = new JButton("Subtract");
		b3 = new JButton("Multiply");
		b4 = new JButton("Divide");
		l3 = new JLabel("Result");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,500);
	
	}
	public static void main(String[] args){
		new Calculatorgui();
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		
	    int num1, num2, result;
		num1 = Integer.parseInt(t1.getText());
		num2 = Integer.parseInt(t2.getText());
		try{
		if(a.getSource() == b1){
			result = num1 + num2;
			l3.setText(result + "");
		}
		else if(a.getSource() == b2)
		{
			result = num1 - num2;
			l3.setText(result + "");
		}
		else if(a.getSource() == b3){
			result = num1 * num2;
			l3.setText(result + "");
		}
		else{
			
			 result = num1/ num2;
			l3.setText(result + "");
			
		}	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
