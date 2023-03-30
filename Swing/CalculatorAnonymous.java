package com.form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorAnonymous extends JFrame{
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	
	public CalculatorAnonymous(){
		l1 = new JLabel("Num1");
		t1 = new JTextField(10);
		l2 = new JLabel("Num2");
		t2 = new JTextField(10);
		b1 = new JButton("Add");
		b2 = new JButton("Subtract");
		b3 = new JButton("Multiply");
		b4 = new JButton("Divide");
		l3 = new JLabel("Result");
		
		 
		    
	     b1.addActionListener(new ActionListener(){

		    @Override
		    public void actionPerformed(ActionEvent e) {
			float num1, num2, result;
			num1 = Float.parseFloat(t1.getText());
			num2 = Float.parseFloat(t2.getText());
			result = num1 + num2;
			l3.setText(result + "");
		}   
	   });
	     
	     b2.addActionListener(new ActionListener(){

			    @Override
			    public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(t1.getText());
				num2 = Float.parseFloat(t2.getText());
				result = num1 - num2;
				l3.setText(result + "");
			}   
		   });
	     b3.addActionListener(new ActionListener(){

			    @Override
			    public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(t1.getText());
				num2 = Float.parseFloat(t2.getText());
				result = num1 * num2;
				l3.setText(result + "");
			}   
		   });
	     b4.addActionListener(new ActionListener(){

			    @Override
			    public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(t1.getText());
				num2 = Float.parseFloat(t2.getText());
				result = num1 / num2;
				l3.setText(result + "");
			}   
		   });
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		
		setLayout(new FlowLayout());
		   setVisible(true);
		   setSize(400,400);
	}
	public static void main(String[] args) {
		new CalculatorAnonymous();

	}

}
