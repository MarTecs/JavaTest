package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ��¼2 {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		String username = null;
		String password = null;

		Scanner scanner = new Scanner(System.in);
		username = scanner.nextLine();
		password = scanner.nextLine();

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
				"sasa");
		// user
		String sql = "select username,password from userinfo where username= ? and password = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		// ���ʺŸ�ֵ
		ps.setObject(1, username);
		ps.setObject(2, password);

		ResultSet rs = ps.executeQuery();
		// �ж��Ƿ�����һ�� ����з���true ���򷵻�false
		if (rs.next()) {
			System.out.println("��¼�ɹ�");
		} else {
			System.out.println("��¼ʧ��");
		}

		connection.close();

	}

}
