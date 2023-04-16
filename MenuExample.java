package com.form;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample extends JFrame{
	JMenuBar mb;
	JMenu m1, m2;
	JMenuItem i1, i2, i3, i4, i5;
	MenuExample(){
		mb = new JMenuBar();
		m1 = new JMenu("Menu");
		m2 = new JMenu("Submenu");
		i1 = new JMenuItem("Item 1");
		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		i4 = new JMenuItem("Item 4");
		i5 = new JMenuItem("Item 5");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m2.add(i4);
		m2.add(i5);
		m1.add(m2);
		mb.add(m1);
		
		setJMenuBar(mb);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args){
		new MenuExample();
		
	}

}
