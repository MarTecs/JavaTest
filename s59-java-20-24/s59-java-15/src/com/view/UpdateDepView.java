package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdateDepView extends JDialog {

	private JLabel depidJLabel = new JLabel("部门编号");
	private JTextField depidField = new JTextField();

	private JLabel depnameJLabel = new JLabel("部门名称");
	private JTextField depnameField = new JTextField();

	private JButton button = new JButton("修改");

	public UpdateDepView(final JTable jTable ,final String depid, final String depname) {

		setTitle("新增部门");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setLayout(null);

		setModal(true);// 设置为模式对话框

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

		depidField.setText(depid);
		depnameField.setText(depname);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String depid = depidField.getText();
				String depname = depnameField.getText();

				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					Connection connection = DriverManager.getConnection(
							"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
							"sa", "sasa");
					String sql = "update dep set depname = ? where depid = ? ";
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setObject(1, depname);
					ps.setObject(2, depid);
					
					
					int n = ps.executeUpdate();
					
					if(n==0){
						JOptionPane.showConfirmDialog(null, "修改失败");
						return ;
					}
					
					//或得表模型
					Vector<String> thVector = new Vector<String>();
					thVector.add("部门编号");
					thVector.add("部门名称");

					Vector<Vector<String>> dataVector = new Vector<Vector<String>>();

					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

					String sql2 = "select depid , depname from dep ";
					PreparedStatement ps2 = connection.prepareStatement(sql2);

					ResultSet rs = ps2.executeQuery();

					while (rs.next()) {
						Vector<String> vector = new Vector<String>();
						vector.add(rs.getString(1));
						vector.add(rs.getString(2));

						dataVector.add(vector);

					}

					DefaultTableModel defaultTableModel = new DefaultTableModel(
							dataVector, thVector);
					jTable.setModel(defaultTableModel);
					
					
					
					
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		setVisible(true);

	}

}
