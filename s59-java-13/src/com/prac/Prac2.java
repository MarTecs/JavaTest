package com.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Prac2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		try(
			Connection connection = DriverManager.getConnection(
					"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59","sa","1018222wxw");
			Statement statement = connection.createStatement();
				){
			String str  
		}
	}
}
