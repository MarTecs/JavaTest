package com.prac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.OptionPaneUI;

public class Prac2 extends JFrame{

	//设置两个JLabel控件
	private JLabel usernameJLabel = new JLabel("用户名：");
	private JLabel passwordJLabel = new JLabel("密    码：");
	
	
	//添加两个JTextField控件
	private JTextField usernameJTextField = new JTextField();
	private JTextField passwordJTextField = new JPasswordField();
	
	//添加两个JButton按钮
	private JButton loginButton = new JButton("登录");
	private JButton resetButton = new JButton("重置");
	
	/**
	 * 
	 */
	Prac2()
	{
		
		
		setTitle("学生管理系统");				//设置窗体标题
		setSize(300, 200);					//设置窗体宽和高
		setLocationRelativeTo(null);		//设置窗体居中
		setResizable(false);   				//设置窗体不能改变大小
		//因为窗体默认点击关闭会隐藏，因此我们这样写是为了不让窗体隐藏起来，从而我们可以对它进行关闭
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);		
		
		//添加监听器事件
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
			//第一个参数填 null 第二个参数是对话框内容，第三个参数是对话框标题
			 int n = JOptionPane.showConfirmDialog(null, "确认要退出么","退出",JOptionPane.YES_NO_OPTION);
			 //System.out.println(n);						//是返回0 否返回1
			 if(n == 0)
				 System.exit(0);
			}
		});
		
		//窗体搞完了，准备添加控件，首先得明确几个控件，这里我们一般使用null布局，也就是绝对布局
		setLayout(null);
		
		//设置各个组件的位置
		usernameJLabel.setBounds(40,30,60,30);
		passwordJLabel.setBounds(40, 70, 60, 30);
		usernameJTextField.setBounds(120, 30, 150, 30);
		passwordJTextField.setBounds(120, 70, 150, 30);
		loginButton.setBounds(40, 120, 80, 30);
		resetButton.setBounds(180, 120, 80, 30);
		
		add(usernameJLabel);
		add(passwordJLabel);
		add(usernameJTextField);
		add(passwordJTextField);
		add(loginButton);
		add(resetButton);
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				usernameJTextField.setText("");
				passwordJTextField.setText("");
			}
		});
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59","sa","1018222wxw");
				String sql = "SELECT username,password from students where username = ? and password = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setObject(1, passwordJTextField.getText());
				ps.setObject(2, passwordJTextField.getText());
				ResultSet rs = ps.executeQuery();
				if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "确认","登录成功",JOptionPane.CLOSED_OPTION);
						Prac2.this.dispose();
					}
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		setVisible(true);					//设置窗体可见
	}
	
	public static void main(String[] args) {
		new Prac2();
	}
}
