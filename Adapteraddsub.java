package com.form;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Adapteraddsub extends MouseAdapter {
	  JFrame f;
	  JLabel l1, l2, l3;
	  JTextField t1,t2;
	  
	  Adapteraddsub(){
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
		  f.addMouseListener(this);
		  f.setLayout(new FlowLayout());
		  f.setSize(400,400);
		  f.setVisible(true);
		  
		  
	  }
	
	  public void mousePressed(MouseEvent e){
		  try{
		   float x, y, result;
		   x = Float.parseFloat(t1.getText());
		   y = Float.parseFloat((t2.getText()));
		   result = x + y;
		   l3.setText(result + "");
		   l3.setForeground(Color.RED);
		  }
		  catch(Exception ex){
			  System.out.println(ex.getMessage());
		  }
		  
	  }
	  public void mouseReleased(MouseEvent e){
		  try{
		   float x, y, result;
		   x = Float.parseFloat(t1.getText());
		   y = Float.parseFloat((t2.getText()));
		   result = x - y;
		   l3.setText(result + "");
		   l3.setForeground(Color.BLUE);
		  }
		  catch(Exception ex){
			  System.out.println(ex.getMessage());
		  }
		  
	  }
	  
	  public static void main(String[] args){
		  new Adapteraddsub();
	  }
	
	

}
