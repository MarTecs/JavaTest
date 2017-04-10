package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddDepView extends JDialog {

	private JLabel depidJLabel = new JLabel("部门编号");
	private JTextField depidField = new JTextField();

	private JLabel depnameJLabel = new JLabel("部门名称");
	private JTextField depnameField = new JTextField();

	private JButton button = new JButton("新增");

	public AddDepView() {

		setTitle("新增部门");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setLayout(null);

		setModal(true);//设置为模式对话框

		depidJLabel.setBounds(50, 40, 80, 20);
		depidField.setBounds(150, 40, 100, 20);

		depnameJLabel.setBounds(50, 80, 80, 20);
		depnameField.setBounds(150, 80, 100, 20);

		button.setBounds(100, 140, 60, 20);

		add(depidJLabel);
		add(depidField);

		add(depnameJLabel);
		add(depnameField);

		add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String depid = depidField.getText();
				String depname = depnameField.getText();

				Connection connection = null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					connection = DriverManager.getConnection(
							"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
							"sa", "sasa");
					String sql = "insert into dep(depid,depname) values(?,?)";
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setObject(1, depid);
					ps.setObject(2, depname);

					int n = ps.executeUpdate();

					if (n > 0) {
						JOptionPane.showMessageDialog(null, "新增成功");
						depidField.setText("");
						depnameField.setText("");
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

}
