package com.example.polo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/mybatis";

		String sql4 ="select * from user";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("注册驱动成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("注册驱动失败");
			e.printStackTrace();
			return ;
		}
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, "root", "12341234");
			Statement  stat= conn.createStatement();

			ResultSet re= stat.executeQuery(sql4);
			while(re.next()) {
				System.out.println(re.getString(1)+" "+re.getString(2));
			}
			conn.close();
			stat.close();
			re.close();
			System.out.println("连接数据库成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库失败");
			e.printStackTrace();
			return;
		}
		
		
	}

}

