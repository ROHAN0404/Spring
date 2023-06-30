package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","admin");
		PreparedStatement ps = con.prepareStatement("Select * from register");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString("name");
			String email=rs.getString("email");
			String pass=rs.getString("password");
			System.out.println("Name :" +name+" Email :"+email+" Password: "+pass);
		}
	}

}
