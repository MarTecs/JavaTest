package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UpdatePasswordView extends JDialog {

	private JLabel oldpasswordJLabel = new JLabel("原始密码");
	private JTextField oldpasswordField = new JPasswordField();

	private JLabel newpasswordJLabel = new JLabel("新密码");
	private JTextField newpasswordField = new JPasswordField();

	private JLabel repeatpasswordJLabel = new JLabel("确认密码");
	private JTextField repeatpasswordField = new JPasswordField();

	private JLabel checkJLabel = new JLabel();
	private JLabel repasswordcheckJLabel = new JLabel();

	private JButton button = new JButton("修改");

	public UpdatePasswordView(final String username) {

		setTitle("修改密码");

		setSize(500, 500);

		setLocationRelativeTo(null);
		setResizable(false);

		setLayout(null);

		oldpasswordJLabel.setBounds(100, 70, 70, 20);
		oldpasswordField.setBounds(180, 70, 170, 20);
		newpasswordJLabel.setBounds(100, 130, 50, 20);
		newpasswordField.setBounds(180, 130, 170, 20);
		checkJLabel.setBounds(370, 130, 60, 20);
		repeatpasswordJLabel.setBounds(100, 220, 70, 20);
		repeatpasswordField.setBounds(180, 220, 170, 20);
		repasswordcheckJLabel.setBounds(370, 220, 60, 20);
		button.setBounds(250, 280, 70, 20);

		add(oldpasswordJLabel);
		add(oldpasswordField);
		add(newpasswordJLabel);
		add(repeatpasswordJLabel);
		add(button);
		add(newpasswordField);
		add(repeatpasswordField);
		add(checkJLabel);
		add(repasswordcheckJLabel);

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String oldpassword = oldpasswordField.getText();
				String newpassword = newpasswordField.getText();
				String repeatedpassword = repeatpasswordField.getText();

				Connection connection = null;

				int n = 0;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					connection = DriverManager.getConnection(
							"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
							"sa", "sasa");
					String sql = "select username , password from userinfo where username = ? and password = ? ";
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setObject(1, username);
					ps.setObject(2, oldpassword);

					ResultSet rs = ps.executeQuery();

					if (!rs.next()) {
						JOptionPane.showMessageDialog(null, "原始密码有误");
						return;
					}

					String sql2 = "update userinfo set password = ? where username = ?";
					PreparedStatement ps2 = connection.prepareStatement(sql2);
					ps2.setObject(1, newpassword);
					ps2.setObject(2, username);

					n = ps2.executeUpdate();
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				if (n > 0) {
					JOptionPane.showMessageDialog(null, "修改成功");
				} else {
					JOptionPane.showMessageDialog(null, "修改失败");
				}

			}
		});

		newpasswordField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				String newpassword = newpasswordField.getText();

				if (newpassword.length() < 6) {
					checkJLabel.setText("×");
					return;
				}

				int num = 0;
				int letter = 0;
				int other = 0;

				for (int i = 0; i < newpassword.length(); i++) {

					char ch = newpassword.charAt(i);
					if (ch >= '0' && ch <= '9') {
						num = 1;
					} else if ((ch >= 'a' && ch <= 'z')
							|| (ch >= 'A' && ch <= 'Z')) {
						letter = 1;
					} else {
						other = 1;

					}

				}

				int result = letter + other + num;

				if (result == 1) {
					checkJLabel.setText("弱");
				} else if (result == 2) {
					checkJLabel.setText("中");
				} else {
					checkJLabel.setText("强");
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

		repeatpasswordField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				String newpassword = newpasswordField.getText();
				String repeatpassword = repeatpasswordField.getText();

				if (newpassword.equals(repeatpassword)) {
					repasswordcheckJLabel.setText("√");
				} else {
					repasswordcheckJLabel.setText("×");

				}
			}
		});

		setVisible(true);

	}


}
