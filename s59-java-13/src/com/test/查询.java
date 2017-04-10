package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ≤È—Ø {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59", "sa",
				"sasa");
		String sql = "select username,password from userinfo";
		PreparedStatement ps = connection.prepareStatement(sql);
	

		ResultSet rs = ps.executeQuery();
	
		while(rs.next()){
			System.out.println(rs.getString(1) + "\t" + rs.getString(2));
		}
		connection.close();

	}

}
