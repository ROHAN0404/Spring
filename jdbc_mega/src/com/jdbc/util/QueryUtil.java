package com.jdbc.util;

public class QueryUtil {

	public static String insertEmployeeQuery() {
		return "INSERT INTO EMPLOYEE_INFO (EMPLOYEE_NAME,EMPLOYEE_ADDRESS,EMPLOYEE_SALARY) VALUES (?,?,?)";
	}
	
	public static String selectAllEmployeeQuery() {
		return "SELECT * FROM EMPLOYEE_INFO";
	}
	public static String selectEmployeeById(int employee_id) {
		return "SELECT * FROM EMPLOYEE_INFO WHERE EMPLOYEE_ID = "+ employee_id;
	}
	public static String deleteEmployeeByName() {
		return "DELETE FROM EMPLOYEE_INFO WHERE EMPLOYEE_NAME = ? " ;
		
	}
	public static String updateEmployeeQuery(int employee_id) {
		return "UPDATE EMPLOYEE_INFO SET EMPLOYEE_NAME = ? , EMPLOYEE_ADDRESS = ? , EMPLOYEE_SALARY = ? WHERE EMPLOYEE_ID = " + employee_id;
	}
	public static String updateEmployeeByAddress(int employee_id) {
		return "UPDATE EMPLOYEE_INFO SET EMPLOYEE_ADDRESS = ? WHERE EMPLOYEE_ID = " + employee_id;
	}
	public static String updateEmployeeBySalary(int employee_id) {
		return "UPDATE EMPLOYEE_INFO SET EMPLOYEE_SALARY = ? WHERE EMPLOYEE_ID = " + employee_id;
	}
}
