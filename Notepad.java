package com.form;


import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Notepad extends JFrame implements ActionListener{
	
	JMenuBar mb;
	JMenu m1, m2, m3, m4, m5;
	JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
	JTextArea t;
	JLabel details;
	JTextField tf;
	JScrollPane sp;
	JFrame f;

	Notepad(){
//		super("Notepad1");
		f = new JFrame("Notepad1");
		details = new JLabel();
		mb = new JMenuBar();
		m1 = new JMenu("File");
		i1 = new JMenuItem("New File");
		i2 = new JMenuItem("Open File");
		
		m2 = new JMenu("Edit");
		i3 = new JMenuItem("Cut");
		i4 = new JMenuItem("Copy");
		i5 = new JMenuItem("Paste");
		
		m3 = new JMenu("Format");
		i6 = new JMenuItem("All Capital");
		i7 = new JMenuItem("All Small");
		
		m4 = new JMenu("View");
		i8 = new JMenuItem("Word Count");
		i9 = new JMenuItem("Character Count");
		
		m5 = new JMenu("Help");
		i10 = new JMenuItem("About");
		t = new JTextArea();

		sp=new JScrollPane(t);
		tf = new JTextField(1000);

		

		t.setMargin( new Insets(5,5,5,5) );

		
		m1.add(i1);
		m1.add(i2);
		m2.add(i3);
		m2.add(i4);
		m2.add(i5);
		m3.add(i6);
		m3.add(i7);
		m4.add(i8);
		m4.add(i9);
		m5.add(i10);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		setJMenuBar(mb);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		i8.addActionListener(this);
		i9.addActionListener(this);
		i10.addActionListener(this);
		


		add(t);
		t.setBounds(200,500,200,100);
		
		
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	public static void main(String[] args){
		new Notepad();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == i1){
			f.setTitle("New Document.txt");
			t.setText("");
			tf.setText("");	
		}
		else if(ae.getSource() == i3){
			t.cut();
			
		}
		else if(ae.getSource() == i4){
			t.copy();
		}
		else if(ae.getSource() == i5){
			t.paste();
		}
		else if(ae.getSource() == i6){
			String st = t.getText().toUpperCase();
			t.setText(st);
		}
		else if(ae.getSource() == i7){
			String st = t.getText().toLowerCase();
			t.setText(st);
		}
		else if(ae.getSource() == i8){
			//to count number of word and character
			String text = t.getText();
			int word = 0;
			int character = 0;
			boolean isWord = false;
			
			for(int i=0; i < text.length(); i++){
				char  a = text.charAt(i);
				if(Character.isWhitespace(a))
				{
					isWord = false;
				}
				else if(!isWord){
					word++;
					isWord = true;
				}
				character++;
				i8.setText("Word count: "+ word);

			}
			
		}
		else if(ae.getSource() == i9){
			String text = t.getText();
			int word = 0;
			int character = 0;
			boolean isWord = false;
			
			for(int i=0; i < text.length(); i++){
				char  a = text.charAt(i);
				if(Character.isWhitespace(a))
				{
					isWord = false;
				}
				else if(!isWord){
					word++;
					isWord = true;
				}
				character++;
				i9.setText("Character count: "+ character);

			}
		
		}
		else if(ae.getSource( )== i10)
		{
            JOptionPane.showMessageDialog(this, "Notepad v1.0\n(c) 2023 Acme Corp.");

			
			
		
		
	}
		else if(ae.getSource() == i2){
			 // Open a file and display its contents in the text area
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(f);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    StringBuilder text = new StringBuilder();

                    while ((line = reader.readLine()) != null) {
                        text.append(line).append("\n");
                    }

                    reader.close();

                    t.setText(text.toString());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(f, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
		}

}
	}}
