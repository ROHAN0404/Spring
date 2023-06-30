package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

	public static void main(String[] args) throws Exception {
		
		//--User Values
		String name="Ravi";
		String email="Ravi23@gmail.com";
		String pass="Ravindra@1965";
		
		//--load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//--create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "admin");
		
		//--create statement
//		PreparedStatement ps = con.prepareStatement("insert into register values('"+name+"','"+email+"','"+pass+"')");
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?)");
		//--setting values in positional arguement(?)
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, pass);
		
		//--execute statement
		int i = ps.executeUpdate();
		
		//--process the results
		if(i>0) {
			System.out.println("Data inserted successfully");
		}
		else {
			System.out.println("Please check the data once");
		}
		System.out.println("Success");
		
		//--close the connection
		con.close();
	}

}
