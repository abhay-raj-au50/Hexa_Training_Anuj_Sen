package com.hexaware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryExp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware","root","123456");
		// now create the Statement Object and then ResultSet
		
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from trainee");
	while(rs.next()) {
		System.out.println(rs.getInt("id") + " "
						 + rs.getString("name") + " "
						 + rs.getInt("course_id") + " "
						 + rs.getString("course_name") + " "
						 + rs.getString("trainer_name") + " ");
	}
	connection.close();
	}

}
