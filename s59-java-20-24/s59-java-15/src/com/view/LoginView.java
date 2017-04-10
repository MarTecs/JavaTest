package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.util.TimerTask;
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
import javax.swing.UnsupportedLookAndFeelException;

import com.listener.WindowClosingListener;

public class LoginView extends JFrame implements Runnable {

	private JLabel usernameJLabel = new JLabel("�û���");
	private JTextField usernameField = new JTextField("yuanzong");

	private JLabel passwordJLabel = new JLabel("����");
	private JTextField passwordField = new JPasswordField("yuanzong");

	private JButton resetButton = new JButton("����");
	private JButton loginButton = new JButton("��¼");

	public LoginView() {

		// ���ñ���
		setTitle("���ܸ߼�����ϵͳ");
		// ���ô�С
		setSize(300, 200);
		// ���þ���
		setLocationRelativeTo(null);
		// ���ô�С���ɱ�
		setResizable(false);
		// ���ò��ַ�ʽ
		setLayout(null);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener(new WindowClosingListener());

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
						// �رյ�¼����
						LoginView.this.dispose();
						new MainView(username);
					} else {
						JOptionPane.showMessageDialog(null, "�û������������");
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

	@Override
	public void run() {

		while (true) {

			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Date date = new Date();
			this.setTitle(date.toString());

		}

		
	}

	public static void main(String[] args) {
		try {
			javax.swing.UIManager
					.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginView loginView = new LoginView();
		Thread thread = new Thread(loginView);
		thread.start();

	}

}
