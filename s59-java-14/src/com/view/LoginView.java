package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

public class LoginView extends JFrame {

	private JLabel usernameJLabel = new JLabel("�û���");
	private JLabel passwordJLabel = new JLabel("����");

	private JTextField usernameField = new JTextField();
	private JTextField passwordField = new JPasswordField();

	private JButton resetButton = new JButton("����");
	private JButton loginButton = new JButton("��¼");

	public LoginView() {

		// ���ñ���
		setTitle("��ӭʹ�����ܸ߼�����ϵͳ");
		// ���ô�С
		setSize(300, 200);
		// ����
		setLocationRelativeTo(null);
		// ���ô���ر��¼�
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		// ���ô��岻�ܸı��С
		setResizable(false);

		// �����¼� �����ڲ���
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "���Ҫ�˳���", "�˳�",
						JOptionPane.YES_NO_OPTION);
				if (n == 0) {
					System.exit(0);
				}
			}

		});

		// ���ò��ַ�ʽ null ��ʾ���ǿղ��� ���Բ���
		setLayout(null);

		// ���ؼ��趨λ�úʹ�С
		usernameJLabel.setBounds(40, 40, 80, 20);
		usernameField.setBounds(150, 40, 100, 20);

		passwordJLabel.setBounds(40, 80, 80, 20);
		passwordField.setBounds(150, 80, 100, 20);

		resetButton.setBounds(50, 130, 60, 20);
		loginButton.setBounds(150, 130, 60, 20);

		add(usernameJLabel);
		add(usernameField);
		add(passwordJLabel);
		add(passwordField);

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

				// �ҵ��û�������û���������
				String username = usernameField.getText();
				String password = passwordField.getText();

				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					Connection connection = DriverManager.getConnection(
							"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
							"sa", "sasa");
					String sql = "select username , password from userinfo where username = ? and password = ? ";
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setObject(1, username);
					ps.setObject(2, password);

					ResultSet rs = ps.executeQuery();

					if (rs.next()) {
						//�رյ�¼����
						LoginView.this.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "�û������������");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new LoginView();
	}

}
