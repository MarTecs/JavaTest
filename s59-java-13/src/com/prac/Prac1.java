package com.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prac1 {
	
	//ʹ��Statement �� insert���
	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		try(
			Connection connection = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59","sa","1018222wxw");
			Statement statement = connection.createStatement();
				){
			String str = "insert into demp(dempid,dempname,dempaddress) values('1','���䲿','ɽ��ʡ˷����')";
			int n = statement.executeUpdate(str);
			if(n > 0)
				System.out.println("�����ɹ���");
		}
		
	}
}
