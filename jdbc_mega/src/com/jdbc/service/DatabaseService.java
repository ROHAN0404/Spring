package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.model.Employee;
import com.jdbc.util.DatabaseUtil;
import com.jdbc.util.QueryUtil;

public class DatabaseService {
	
	DatabaseUtil databaseUtil =new DatabaseUtil();

	public void insertEmployee(Employee employee) throws SQLException {
		
		try(Connection connection=databaseUtil.getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(QueryUtil.insertEmployeeQuery());){
			
			preparedStatement.setString(1,employee.getEmployeeName());
			preparedStatement.setString(2,employee.getEmployeeAddress());
			preparedStatement.setDouble(3,employee.getEmployeeSalary());
			
			int rows=preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("Record created successfully. ");
			}else {
				System.out.println("Insert record failed..");
			}
		
	}
		
}	//End of insertEmployee
	public void getAllEmployees() throws SQLException {
		try(Connection connection=databaseUtil.getConnection();
			Statement statement = connection.createStatement();
				ResultSet resultSet=statement.executeQuery(QueryUtil.selectAllEmployeeQuery()); ){
			
			while(resultSet.next()) {
				printEmployee(new Employee(resultSet.getInt("EMPLOYEE_ID"),//fetch data of single object from resultset and pass to a new employee object via constructor
						resultSet.getString("EMPLOYEE_NAME"),
						resultSet.getString("EMPLOYEE_ADDRESS"),
						resultSet.getDouble("EMPLOYEE_SALARY")
						));
			}
		}
	}//End of get employees
	
	private void printEmployee(Employee employee) {
		System.out.println("Employee id: "+employee.getEmployeeId());
		System.out.println("Employee name: "+employee.getEmployeeName());
		System.out.println("Employee address: "+employee.getEmployeeAddress());
		System.out.println("Employee salary: "+employee.getEmployeeSalary());
		System.out.println("--------------------------------------------------");
	}
	public boolean getEmployeeById(int id) throws SQLException {
		boolean isFound=false;
		
		try(Connection connection=databaseUtil.getConnection();
				Statement statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery( QueryUtil.selectEmployeeById(id));
				){
			if(resultSet.next()) {
				isFound=true;
				printEmployee(new Employee(resultSet.getInt("EMPLOYEE_ID"),resultSet.getString("EMPLOYEE_NAME"),resultSet.getString("EMPLOYEE_ADDRESS"),resultSet.getDouble("EMPLOYEE_SALARY")));
			} else {
				System.out.println("Record not found for id "+id);
			}
			
		}
		return isFound;
	}//End of getEmployeeById
	
	/*public void deleteEmployeeById(int employee_id) throws SQLException {
		
		try(Connection connection=databaseUtil.getConnection();
				Statement statement=connection.createStatement();
				) {
			int rows=statement.executeUpdate(QueryUtil.deleteEmployeeById(employee_id));
			if(rows>0) {
				System.out.println("Record deleted successfully");
			} else {
				System.out.println("Something went wrong");
			}
		}
		
		
	}*///End of deleteEmployeeById
	public void deleteEmployeeByName(String employee_name) throws SQLException {
		
		try(Connection connection=databaseUtil.getConnection();
				PreparedStatement prepared=connection.prepareStatement(QueryUtil.deleteEmployeeByName());
				) {
			prepared.setString(1,employee_name);
			int rows=prepared.executeUpdate();
			if(rows>0) {
				System.out.println("Record deleted successfully");
			} else {
				System.out.println("Something went wrong");
			}
		}
		
		
	}//End of deleteEmployeeByName
	
	public void updateEmployee(Employee employee) throws SQLException {
		
		try(Connection connection = databaseUtil.getConnection();
				PreparedStatement prepared=connection.prepareStatement(QueryUtil.updateEmployeeQuery(employee.getEmployeeId()));
				){
			prepared.setString(1,employee.getEmployeeName());
			prepared.setString(2,employee.getEmployeeAddress());
			prepared.setDouble(3,employee.getEmployeeSalary());
			
			int rows=prepared.executeUpdate();
			if(rows>0) {
				System.out.println("Record updated successfully. ");
			} else {
				System.out.println("Failed to update record. ");
			}
		 	
		}
		
	}//End of updateEmployee
	public void updateEmployeeName(int id,String name) throws SQLException {
		
		try(Connection connection=databaseUtil.getConnection();){
						
//				Employee emp=new Employee(resultSet.getInt("EMPLOYEE_ID"),resultSet.getString("EMPLOYEE_NAME"),resultSet.getString("EMPLOYEE_ADDRESS"),resultSet.getDouble("EMPLOYEE_SALARY"));
				String query="UPDATE EMPLOYEE_INFO SET EMPLOYEE_NAME = ? WHERE EMPLOYEE_ID= " + id;
				PreparedStatement prepared=connection.prepareStatement(query);
				prepared.setString(1,name);
				int rows=prepared.executeUpdate();
				if(rows>0) {
					System.out.println("Record updated successfully. ");
				} else {
					System.out.println("Failed to update record. ");
				}										
		}
		
	}
	public void updateEmployeeSalary(int id,Double salary) throws SQLException {
		
		try(Connection connection=databaseUtil.getConnection();){
						
//				Employee emp=new Employee(resultSet.getInt("EMPLOYEE_ID"),resultSet.getString("EMPLOYEE_NAME"),resultSet.getString("EMPLOYEE_ADDRESS"),resultSet.getDouble("EMPLOYEE_SALARY"));
//				String query="UPDATE EMPLOYEE_INFO SET EMPLOYEE_SALARY = ? WHERE EMPLOYEE_ID= " + id;
				PreparedStatement prepared=connection.prepareStatement(QueryUtil.updateEmployeeBySalary(id));
				prepared.setDouble(1,salary);
				int rows=prepared.executeUpdate();
				if(rows>0) {
					System.out.println("Record updated successfully. ");
				} else {
					System.out.println("Failed to update record. ");
				}										
		}
		
	}
	public void updateEmployeeAddress(int id,String address) throws SQLException {
		
		try(Connection connection=databaseUtil.getConnection();){
						
//				Employee emp=new Employee(resultSet.getInt("EMPLOYEE_ID"),resultSet.getString("EMPLOYEE_NAME"),resultSet.getString("EMPLOYEE_ADDRESS"),resultSet.getDouble("EMPLOYEE_SALARY"));
//				String query="UPDATE EMPLOYEE_INFO SET EMPLOYEE_ADDRESS = ? WHERE EMPLOYEE_ID= " + id;
				PreparedStatement prepared=connection.prepareStatement(QueryUtil.updateEmployeeByAddress(id));
				prepared.setString(1,address);
				int rows=prepared.executeUpdate();
				if(rows>0) {
					System.out.println("Record updated successfully. ");
				} else {
					System.out.println("Failed to update record. ");
				}										
		}
		
	}
	
	
}


