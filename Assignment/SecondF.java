package com.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.util.*;


public class SecondF extends JFrame {
	JLabel l1, l2, l3, l4, l5;
	private JTable ta1;
    JButton orderButton;
	JCheckBox c1, c2, c3, c4;
	
	
	SecondF(){
		setTitle("Hamro Restaurant Menu----Good Food Good Mood");
		JFrame j = new JFrame();
		
		l1 = new JLabel("Select Food Items",JLabel.CENTER);
		l1.setVerticalAlignment(JLabel.TOP);
	    l1.setFont(new Font("Verdana", Font.PLAIN, 20));
	    l1.setForeground(new Color(120, 90, 40));
	    l1.setBackground(new Color(100, 20, 70));
	    JDialog dialog = new JDialog();
	    
	    Object[] colName = {"Select", "Food Item", "Price(NPr)" };
	    Object[][] data = {
	    		            {false, "Chowmin", new Double(120.0)},
	    					{false,"Momo", new Double(150.0)},
	    					{true,"Pizza", new Double(650.0)},
	    					{false,"Burger", new Double(250.0)}
	    };
	    
	    DefaultTableModel modal = new DefaultTableModel(data, colName);
	    ta1 = new JTable(modal){
	    	 private static final long serialVersionUID = 1L;
	    	 
	    	 public Class getColumnClass(int column){
	    		 
				switch (column){
				
				    case 0:
				       return Boolean.class;
				       
				    case 1:
				    	return String.class;
				    
				    default:
				    	return Double.class;				      
				      
				}
	    		 
	    		 
	    	 }
	    	
	    };
	   
	    
		  add(l1);
		  ta1.setSize(100, 200);
		  ta1.setShowGrid(false);
	
		  ta1.setBackground(Color.YELLOW);
		  ta1.setPreferredScrollableViewportSize(new Dimension(500, 65));
		  JScrollPane sp=new JScrollPane(ta1);    
		  add(sp);

	      add(new JScrollPane(ta1), FlowLayout.CENTER);
	      ta1.setShowGrid(true);
	    
	      orderButton = new JButton("Order");
	     
	      orderButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent a) {
					   

					
				        if (a.getSource() == orderButton) {
				          
				            java.util.List<String> selectedItems = new ArrayList<>();
				            double totalPrice = 0.0;
				            for (int i = 0; i < modal.getRowCount(); i++) {
				                Boolean isSelected = (Boolean) modal.getValueAt(i, 0);
				                String itemName = (String) modal.getValueAt(i, 1);
				                Double itemPrice = (Double) modal.getValueAt(i, 2);
			
				                if (isSelected) {
				                    selectedItems.add(itemName);
				                   
				                    totalPrice += itemPrice;
				                }
				            }
				            String message;
				            if (selectedItems.size() == 0) {
				                message = "No items selected.";
				            } else {
				                message = "Selected items:\n";
				                for (String item : selectedItems) {
				                    message += "- " + item + "\n";
				                }
				                message += "Total price: " + totalPrice + " NPr";
				            }
				          
				            
				            JOptionPane.showMessageDialog(dialog, message);
				            
//				           modal.fireTableDataChanged(); // reinitialize the table model
//				          
			                dialog.setLocationRelativeTo(null);
//			                dialog.setVisible(true);
			                SecondF s = new SecondF();
							s.setVisible(true);
//							ta1.setModel(modal); // reassign the original table model
			            }

				            

				}
	        });
	       add(orderButton, BorderLayout.SOUTH);
	      
		
	    setBounds(100, 100, 400, 100);
	    getContentPane().setBackground(Color.YELLOW);
	    setLayout(new FlowLayout());
//	    setResizable(false);
		setVisible(true);
		setSize(600,300);
	}
	


 public static void main(String[] args){
	 SecondF a = new SecondF();
//	 a.setVisible(true);
 }
 }
 

