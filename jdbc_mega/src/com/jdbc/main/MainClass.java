package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.service.DatabaseService;

public class MainClass {

	public static void main(String[] args) {
		
		DatabaseService databaseService=new DatabaseService();
		
		try(Scanner scanner=new Scanner(System.in);){
			
			boolean isRunning=true;
			while(isRunning) {
				
				System.out.println("Enter choice");
				System.out.println("1. Insert");
				System.out.println("2. Select all");
				System.out.println("3. Select employee by id");
				System.out.println("4. Delete employee");
				System.out.println("5. Update employee");
				System.out.println("6. Exit");
				
				
				int choice=Integer.parseInt(scanner.nextLine());
				
				switch(choice) {
				case 1:
					System.out.println("Enter name, address, salary");
					databaseService.insertEmployee(new Employee(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine())));
					break;
				case 2:
					databaseService.getAllEmployees();
					break;
				case 3:
					System.out.println("Enter id of an employee");
					databaseService.getEmployeeById(Integer.parseInt(scanner.nextLine()));
					break;
				case 4:
					System.out.println("Enter name of an employee");
					String name=scanner.nextLine();
					databaseService.deleteEmployeeByName(name);
//					databaseService.deleteEmployeeByName(Integer.parseInt(scanner.nextLine()));
					break;
				case 5:
					System.out.println("Enter id of an employee");
					int updateId=Integer.parseInt(scanner.nextLine());
					boolean isFound = databaseService.getEmployeeById(updateId);
					
					if(isFound) {
						System.out.println("\n Menus");
						System.out.println("1: Update name");
						System.out.println("2: Update salaray");
						System.out.println("3: Update address");
						System.out.print("Enter your choice : ");
						int x=scanner.nextInt();
						
						switch(x) {
						case 1:
							String name1;
							scanner.nextLine();
							System.out.print("Enter the name you want update : ");
							name1=scanner.nextLine();
//							Employee employee = new Employee(updateId,scanner.nextLine(),scanner.nextLine(),Double.parseDouble(scanner.nextLine()));
							databaseService.updateEmployeeName(updateId,name1);
							break;
						case 2:
							Double salary;
							scanner.nextLine();
							System.out.print("Enter the salary you want update : ");
							salary=Double.parseDouble(scanner.nextLine());
							databaseService.updateEmployeeSalary(updateId, salary);
							break;
						case 3:
							String address;
							scanner.nextLine();
							System.out.print("Enter the address you want update : ");
							address=scanner.nextLine();
							databaseService.updateEmployeeAddress(updateId, address);
							break;
						}
					}
					break;
				case 6:
					System.out.println("Thank you, Visit Again");
					isRunning=false;
					break;
				default:
					
					break;
				}
			}
			
			
		} 	catch(Exception e) {
			throw new RuntimeException("Something went wrong "+e);
		}
	

	}

}
