package com.form;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyboardListenerDemo extends JFrame implements KeyListener{
	JTextArea a;
	
	public KeyboardListenerDemo() {
		a = new JTextArea();
		
		add(a);
		a.addKeyListener(this);
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] args){
		new KeyboardListenerDemo();
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
//		a.setText("key pressed");
		System.out.println("Key Pressed");
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Released");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed");
		
	}

}


