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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShowEmpView extends JDialog {

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

	public ShowEmpView() {

		setTitle("显示员工");
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
		thVector.add("员工编号");
		thVector.add("员工名称");
		thVector.add("员工电话");
		thVector.add("身份证号码");
		thVector.add("入职日期");
		thVector.add("员工性别");
		thVector.add("员工状体");
		thVector.add("所在部门");
		thVector.add("出生日期");

		Vector<Vector<String>> dataVector = new Vector<Vector<String>>();

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
					"sasa");
			String sql = "select empid , empname , emptel , birthday , gender , status , depname ,hireday , id from emp e , dep d where e.did = d.depid ";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Vector<String> vector = new Vector<String>();
				vector.add(rs.getString(1));
				vector.add(rs.getString(2));
				vector.add(rs.getString(3));
				vector.add(rs.getString(9));
				vector.add(rs.getDate(8).toString());
				vector.add(rs.getString(5).equals("1") ? "男" : "女");
				vector.add(rs.getString(6).equals("1") ? "在职" : "离职");
				vector.add(rs.getString(7));
				vector.add(rs.getDate(4).toString());

				dataVector.add(vector);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		DefaultTableModel defaultTableModel = new DefaultTableModel(dataVector,
				thVector);
		jTable.setModel(defaultTableModel);
		jTable.getTableHeader().setReorderingAllowed(false);
		
		delButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int row=jTable.getSelectedRow();
				if(row==-1){
					System.out.println("没有选中");
				}
				String id=(String) jTable.getValueAt(row, 0);
				
				Connection connection = null;
				
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						connection = DriverManager.getConnection(
								"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59",
								"sa", "sasa");
						String sql="delete from emp where empid=?";
						PreparedStatement ps=connection.prepareStatement(sql);
						ps.setObject(1, id);
						
						int n=ps.executeUpdate();
						if(n>0){
							
							JOptionPane.showMessageDialog(null, "yes");
							//
							Vector<String> thVector = new Vector<String>();
							thVector.add("员工编号");
							thVector.add("员工名称");
							thVector.add("员工电话");
							thVector.add("身份证号码");
							thVector.add("入职日期");
							thVector.add("员工性别");
							thVector.add("员工状体");
							thVector.add("所在部门");
							thVector.add("出生日期");

							Vector<Vector<String>> dataVector = new Vector<Vector<String>>();

							try {
								Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								Connection connection1 = DriverManager.getConnection(
										"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
										"sasa");
								String sql1= "select empid , empname , emptel , birthday , gender , status , depname ,hireday , id from emp e , dep d where e.did = d.depid ";
								PreparedStatement ps1 = connection1.prepareStatement(sql1);

								ResultSet rs = ps1.executeQuery();

								while (rs.next()) {
									Vector<String> vector = new Vector<String>();
									vector.add(rs.getString(1));
									vector.add(rs.getString(2));
									vector.add(rs.getString(3));
									vector.add(rs.getString(9));
									vector.add(rs.getDate(8).toString());
									vector.add(rs.getString(5).equals("1") ? "男" : "女");
									vector.add(rs.getString(6).equals("1") ? "在职" : "离职");
									vector.add(rs.getString(7));
									vector.add(rs.getDate(4).toString());

									dataVector.add(vector);

								}
							} catch (Exception e1) {
								e1.printStackTrace();
							}

							DefaultTableModel defaultTableModel = new DefaultTableModel(dataVector,
									thVector);
							jTable.setModel(defaultTableModel);
							jTable.getTableHeader().setReorderingAllowed(false);
							
						}else{
							JOptionPane.showMessageDialog(null, "no");
							return;
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally{
						try {
							connection.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				
			}
		});

		add(jScrollPane);

		setModal(true);// 设置为模式对话框
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new ShowEmpView();
	}

}
