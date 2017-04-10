package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShowDepView extends JDialog {

	private JScrollPane jScrollPane = new JScrollPane(
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	private JButton delButton = new JButton("删除");
	private JButton updateButton = new JButton("修改");

	private JTable jTable = new JTable() {
		public boolean isCellEditable(int row, int column) {
			return false;
		};
	};

	public ShowDepView() {

		setTitle("显示部门");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setLayout(null);

		jScrollPane.setBounds(50, 50, 680, 300);
		jScrollPane.getViewport().add(jTable);

		delButton.setBounds(100, 400, 60, 20);
		updateButton.setBounds(200, 400, 60, 20);

		add(delButton);
		add(updateButton);

		Vector<String> thVector = new Vector<String>();
		thVector.add("部门编号");
		thVector.add("部门名称");

		Vector<Vector<String>> dataVector = new Vector<Vector<String>>();

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
					"sasa");
			String sql = "select depid , depname from dep ";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vector<String> vector = new Vector<String>();
				vector.add(rs.getString(1));
				vector.add(rs.getString(2));

				dataVector.add(vector);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		DefaultTableModel defaultTableModel = new DefaultTableModel(dataVector,
				thVector);
		jTable.setModel(defaultTableModel);
		jTable.getTableHeader().setReorderingAllowed(false);

		add(jScrollPane);

		setModal(true);// 设置为模式对话框

		delButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = jTable.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "请选中先！！");
					return;
				}

				String depid = (String) jTable.getValueAt(row, 0);

				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					Connection connection = DriverManager.getConnection(
							"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
							"sa", "sasa");
					String sql = "delete from dep where depid = ? ";
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setObject(1, depid);

					int n = ps.executeUpdate();

					if (n == 0) {
						JOptionPane.showMessageDialog(null, "删除失败");
						return;
					}

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

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		updateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = jTable.getSelectedRow();

				if (row == -1) {
					JOptionPane.showMessageDialog(null, "请选中先");
					return;
				}

				String depid = (String) jTable.getValueAt(row, 0);
				String depname = (String) jTable.getValueAt(row, 1);

				new UpdateDepView(jTable,depid, depname);

			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new ShowDepView();
	}

}
