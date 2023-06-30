package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {
	public static void main(String[] args) throws Exception {
		
		String name="Rohan";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","admin");
		PreparedStatement ps = con.prepareStatement("Delete from register Where name=?");
		ps.setString(1, name);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Successfully Deleted");
		}
		else {
			System.out.println("Dletion Failed");
		}
		con.close();
	}
}
