package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class 新增部门 {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		// 1.拷贝驱动
		// 2.加载驱动
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// 3.得到连接对象
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
				"sasa");
		// 4.写sql
		String sql = "insert into dep(depid , depname) values('1' , '小卖部') ";

		// 5.创建指令对象
		Statement statement = connection.createStatement();
		// 6.发送执行指令
		int n = statement.executeUpdate(sql);
		// 关闭连接
		connection.close();

	}

}
