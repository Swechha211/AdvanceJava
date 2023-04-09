package com.form;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyAdapteraddsub extends KeyAdapter{
	  JFrame f;
	  JLabel l1, l2, l3;
	  JTextField t1,t2;
	  
	  public KeyAdapteraddsub(){
		  f = new JFrame();
		  l1 = new JLabel("Num 1");
		  t1 = new JTextField(10);
		  
		  l2 = new JLabel("Num 2");
		  t2 = new JTextField(10);
		  l3 = new JLabel("Result");
		  
		  f.add(l1);
		  f.add(t1);
		  f.add(l2);
		  f.add(t2);
		  f.add(l3);
		  t1.addKeyListener(this);
		  t2.addKeyListener(this);
		  f.setLayout(new FlowLayout());
		  f.setSize(400,400);
		  f.setVisible(true);
		  
	  }
	  public void keyPressed(KeyEvent e){
		  try{
			  int num1 = Integer.parseInt(t1.getText());
		        int num2 = Integer.parseInt(t2.getText());
		      
		            int sum = num1 + num2;
		         
		            l3.setText("Sum: " + sum);
		            l3.setForeground(Color.RED);
		            System.out.println("Key Pressed");
		       
		  }catch(Exception ex){
			  System.out.println(ex.getMessage());
		  }
	  }
	  public void keyReleased(KeyEvent e) {
		  
		  try{
			  int num1 = Integer.parseInt(t1.getText());
		        int num2 = Integer.parseInt(t2.getText());
		      
		            int sum = num1 - num2;
		         
		            l3.setText("Difference: " + sum);
		            l3.setForeground(Color.BLUE);
		            System.out.println("Key released");
		       
		  }catch(Exception ex){
			  System.out.println(ex.getMessage());
		  }
	       
}

	public static void main(String[] args){
		new KeyAdapteraddsub();
	}
}
