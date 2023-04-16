package com.form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ButtonExample extends JFrame{
	JButton b;
	JTextField t1;
	JLabel l1, l2, l3, l4, l;
	JCheckBox c1, c2, c3;
	JRadioButton r1, r2, r3;
	JPasswordField p;
	public ButtonExample() {
		l1 = new JLabel("Username");
		t1 =  new JTextField(10);
		l2 = new JLabel("Password");
		p = new JPasswordField(10);
		l = new JLabel("Gender :");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		r3 = new JRadioButton("Others");
	    l3 = new JLabel("Subject");
	    c1 = new JCheckBox("Java");
	    c2 = new JCheckBox("C");
	    c3 = new JCheckBox("PHP");
	    b = new JButton("Submit");
	    l4 = new JLabel("Your info");
	    ButtonGroup bg = new ButtonGroup();
	    
	    b.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
		  
		   String info = "Username :  "+ t1.getText() + "\n";
		   info += "   Password : ***"+ "\n";
		   String gender = "   Gender : ";
		   if(r1.isSelected()){
		    	gender += "Male ";
		   }
		   else if(r2.isSelected()){
			   gender += "Female ";
		   }
		   else{
			   gender += "Others "; 
		   }
		    String s = "   Subject selected : ";
		    if(c1.isSelected()){
		    	s += "Java, ";
		    }
		     if(c2.isSelected()){
		    	s += "C, ";
		    }
		     if(c3.isSelected()){
		    	s += "PHP";
		    }
		    info += gender; 
		    info += s; 
		     l4.setText(info);
				
			}
	    	
	    });
	       add(l1);
		   add(t1);
		   add(l2);
		   add(p);
		   add(l);
		   
		   bg.add(r1);
		   bg.add(r2);
		   bg.add(r3);
		   add(r1);
		   add(r2);
		   add(r3);
		   add(l3);
		   add(c1);
		   add(c2);
		   add(c3);
		   add(b);
		   add(l4);
		   setLayout(new FlowLayout());
		   setVisible(true);
		   setSize(400,400);	
		
	}
	public static void main(String[] args){
		new ButtonExample();
	}
	
	
	

}
