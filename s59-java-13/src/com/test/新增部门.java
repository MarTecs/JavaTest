package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class �������� {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		// 1.��������
		// 2.��������
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// 3.�õ����Ӷ���
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
				"sasa");
		// 4.дsql
		String sql = "insert into dep(depid , depname) values('1' , 'С����') ";

		// 5.����ָ�����
		Statement statement = connection.createStatement();
		// 6.����ִ��ָ��
		int n = statement.executeUpdate(sql);
		// �ر�����
		connection.close();

	}

}
