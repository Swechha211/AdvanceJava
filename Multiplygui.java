package com.form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Multiplygui extends JFrame implements ActionListener
{
	JButton b;
	JLabel l1,l2, l3;
	JTextField t1,t2;
	
	Multiplygui()
	{
		l1 = new JLabel("Num 1");
		t1 = new JTextField(10);
		l2 = new JLabel("Num 2");
		t2 = new JTextField(10);
		b = new JButton("Multiply");
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
	public static void main(String[] args)
	{
		new Multiplygui();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1, num2, result;
		num1 = Integer.parseInt(t1.getText());
		num2 = Integer.parseInt(t2.getText());
		result = num1 * num2;
		l3.setText(result + "");
		
	}

}
