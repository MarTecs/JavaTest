package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {

	private JLabel usernameJLabel = new JLabel("用户名");
	private JTextField usernameField = new JTextField("sunjob");

	private JLabel passwordJLabel = new JLabel("密码");
	private JTextField passwordField = new JPasswordField("sunjob");

	private JButton resetButton = new JButton("重置");
	private JButton loginButton = new JButton("登录");

	public LoginView() {

		// 设置标题
		setTitle("赛杰高级管理系统");
		// 设置大小
		setSize(300, 200);
		// 设置居中
		setLocationRelativeTo(null);
		// 设置大小不可变
		setResizable(false);
		// 设置布局方式
		setLayout(null);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				int n = JOptionPane.showConfirmDialog(null, "真的要退出吗?", "退出",
						JOptionPane.YES_NO_OPTION);
				if (n == 0) {
					System.exit(0);
				}

			}
		});

		usernameJLabel.setBounds(40, 40, 60, 20);
		usernameField.setBounds(120, 40, 100, 20);

		passwordJLabel.setBounds(40, 100, 60, 20);
		passwordField.setBounds(120, 100, 100, 20);

		resetButton.setBounds(40, 150, 60, 20);
		loginButton.setBounds(120, 150, 60, 20);

		add(usernameField);
		add(usernameJLabel);

		add(passwordField);
		add(passwordJLabel);

		add(resetButton);
		add(loginButton);

		resetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				usernameField.setText("");
				passwordField.setText("");

			}
		});

		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String username = usernameField.getText();
				String password = passwordField.getText();
				Connection connection = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					connection = DriverManager.getConnection(
							"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
							"sa", "sasa");
					String sql = "select username , password from userinfo where username = ? and password = ? ";
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setObject(1, username);
					ps.setObject(2, password);

					ResultSet rs = ps.executeQuery();

					if (rs.next()) {
						// 关闭登录界面
						LoginView.this.dispose();
						new MainView(username);
					} else {
						JOptionPane.showMessageDialog(null, "用户名或密码错误");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					try {
						connection.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}

			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {

		new LoginView();

	}

}
