package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {

	public static void main(String[] args) throws Exception {
		
		String name="Ravindra";
		String email="Ravi23@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "admin");
		PreparedStatement ps = con.prepareStatement("update register set name=? where email=?");
		ps.setString(1, name);
		ps.setString(2, email);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("Succesfully Updated");
		}
		else {
			System.out.println("Updation Failed");
		}
		con.close();

	}

}
