package com.prac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.listener.WindowClosingListener;

public class AddDepView extends JDialog
{

	private JLabel depIdJLabel = new JLabel("部门编号：");
	private JLabel depNameJLabel = new JLabel("部门名称：");
	
	private JTextField depIdField = new JTextField();
	private JTextField depNameField = new JTextField();
	
	private JButton button = new JButton("修改");
	
	public AddDepView() {
		// TODO Auto-generated constructor stub
		this.setTitle("添加部门");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		//这里记得设置为模式对话框
		this.setModal(true);
		
		
		//设置两个
		depIdJLabel.setBounds(50, 50, 70, 30);
		depIdField.setBounds(180, 50, 200, 30);
		
		depNameJLabel.setBounds(50, 120, 70, 30);
		depNameField.setBounds(180, 120, 200, 30);
		
		button.setBounds(120, 200, 60, 30);
		
		
		this.add(depIdJLabel);
		this.add(depIdField);
		this.add(depNameJLabel);
		this.add(depNameField);
		this.add(button);
		
		this.addWindowListener(new WindowClosingListener());
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String depId = depIdField.getText();
				String depName = depNameField.getText();
				Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59","sa","1018222wxw");
				String sql = "insert into dep(depId,depName) values(?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setObject(1, depId);
				ps.setObject(2, depName);
				int n = ps.executeUpdate();
					if(n > 0 )
						JOptionPane.showMessageDialog(null, "添加成功");
				}
			}
		});
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddDepView();
	}
}
