package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
	public static final String DATABASE_URl="jdbc:mysql://localhost:3306/db_01";
	public static final String USERNAME="root";
	public static final String PASSWORD="admin";
	
	public DatabaseUtil() {
		try {
			Class.forName(DRIVER_PATH);
		} catch(Exception e) {
			throw new RuntimeException("Something went wrong." + e);
		}
		
	}//End of constructor
	
	public Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(DATABASE_URl,USERNAME,PASSWORD);
	}//End of getConnection
}
