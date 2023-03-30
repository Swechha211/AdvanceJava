package com.form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddAnonymous extends JFrame {
	JLabel l1, l2,l3;
	JTextField t1, t2;
	JButton b;
	
	public AddAnonymous() {
	
		 l1 = new JLabel("Num1");
		 t1 = new JTextField(10);
		 l2 = new JLabel("Num2");
		 t2 = new JTextField(10);
		 b = new JButton("Add");
	     l3 = new JLabel("Result");
	     b.setBounds(50,100,60,30);  
	    
	     b.addActionListener(new ActionListener(){

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	try{
					float num1, num2, result;
					num1 = Float.parseFloat(t1.getText());
					num2 = Float.parseFloat(t2.getText());
					result = num1 + num2;
					l3.setText(result + "");
		           } catch(Exception e1){
		        	   System.out.println(e1.getMessage());
		        	   }
		           }
	                });
	   
	   add(l1);
	   add(t1);
	   add(l2);
	   add(t2);
	   add(l3);
	   add(b);
	   setLayout(new FlowLayout());
	   setVisible(true);
	   setSize(400,400);
	   
	}
	public static void main(String[] args) {
		new AddAnonymous();
	}
	}


