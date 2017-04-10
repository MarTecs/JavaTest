package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class 登录2 {
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
		// 给问号赋值
		ps.setObject(1, username);
		ps.setObject(2, password);

		ResultSet rs = ps.executeQuery();
		// 判断是否有下一条 如果有返回true 否则返回false
		if (rs.next()) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

		connection.close();

	}

}
