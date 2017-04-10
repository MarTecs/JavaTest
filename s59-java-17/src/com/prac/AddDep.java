package com.prac;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.listener.WindowClosingListener;

public class AddDep extends JDialog{

	private JLabel depIdLabel = new JLabel("部门编号");
	private JLabel depNameLabel = new JLabel("部门名称");
	
	private JTextField depIdField = new JTextField();
	private JTextField depNameField = new JTextField();
	
	private JButton button = new JButton("添加");
	public AddDep() {
		// TODO Auto-generated constructor stub
		this.setTitle("添加部门");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		
		depIdLabel.setBounds(50, 50, 80, 20);
		depIdField.setBounds(120, 50, 200, 20);
		
		depNameLabel.setBounds(50, 100, 80, 20);
		depNameField.setBounds(120, 100, 200, 20);
		button.setBounds(80, 150, 80, 20);
		
		this.add(depIdLabel);
		this.add(depIdField);
		this.add(depNameField);
		this.add(depNameLabel);
		this.add(button);
		this.addWindowListener(new WindowClosingListener());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddDep();
	}
}
