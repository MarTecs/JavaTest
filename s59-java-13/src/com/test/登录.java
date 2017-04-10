package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class 登录 {
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
		String sql = "select username,password from userinfo where username='"+username+"' and password ='"+password+"'";
		System.out.println(sql);
		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(sql);
		// 判断是否有下一条 如果有返回true 否则返回false
		if (rs.next()) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

	}

}
