package com.form;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstAssignment extends JFrame{
	JPanel pa;
	JButton b1, b2;
	JLabel l1, l2, l3;
	JTextField t1;
	JPasswordField p;
	public FirstAssignment() {
		setTitle("Welcome to Hamro Restaurant");
		Font f1 = new Font("Verdana", Font.PLAIN, 25);
		Font  f2  = new Font(Font.SANS_SERIF,  Font.BOLD, 10);
		Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
		Font  f4  = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 15);
		
	//default table model
		l1 = new JLabel("Restaurant Ordering System",JLabel.CENTER) ;
		l1.setVerticalAlignment(JLabel.TOP);
	    l1.setFont(f1);
	    l1.setForeground(new Color(120, 90, 40));
	    l1.setBackground(new Color(100, 20, 70));
	    
		l2 = new JLabel("Username ",JLabel.CENTER);
		l2.setFont(f3);
		t1 = new JTextField(20);
		
		l3 = new JLabel("Password ",JLabel.CENTER);
		l3.setFont(f3);
		p = new JPasswordField(20);
		b1 = new JButton("Login");
		b1.setFont(f4);
		
		
	
		 b1.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = t1.getText();
				String password = new String(p.getPassword());
		 
				if(username.equals("Swechha") && password.equals("123") ){
					
				SecondF s = new SecondF();
				s.setVisible(true);
//				RestaurantOrderingBilling r = new RestaurantOrderingBilling();
//				r.setVisible(true);
				dispose();
				
		        }
				  
	         else {
	           System.out.println("Incorect username and password");
	        

			}}
			 
		 });
		
	
	
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(p);
		add(b1);
		setBounds(40, 90, 100, 50);
		getContentPane().setBackground(Color.lightGray);
		setLayout(new FlowLayout());
		setResizable(false);
		setVisible(true);
		setSize(400,400);
//		}
		
		
		
		 
		 
		 
	 }
	 
	 public static void main(String[] args){
		
		 FirstAssignment f = new FirstAssignment();
			
	 }

}


