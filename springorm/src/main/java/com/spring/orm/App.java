package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class); 
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
       
      
       boolean go=true;
       while(go) {
    	   System.out.println("Press 1 to add new student");
           System.out.println("Press 2 to to display all student");
           System.out.println("Press 3 to get detail of single student");
           System.out.println("Press 4 to delete student");
           System.out.println("Press 5 to update student");
           System.out.println("Press 6 to exit");
           
           try {
        	   int choice = Integer.parseInt(br.readLine());
        	   switch (choice) {
			case 1:
				//add new student
				System.out.println("Enter user userid : ");
				int uId = Integer.parseInt(br.readLine());
				
				System.out.println("Enter user userName : ");
				String userName = br.readLine();
				
				System.out.println("Enter user userCity : ");
				String userCity = br.readLine();
				
				//creating student object and setting values 
				Student stu=new Student(uId,userName,userCity);

				//saving student object to database by  calling insert of studentdao
				int r = studentDao.insert(stu);
				System.out.println(r +" Student added");
				
				break;
			case 2:
				//to display all students
				System.out.println("************************");
				List<Student> allStudents = studentDao.getAllStudents();
				for(Student s: allStudents) {
					System.out.println("Id :    "+s.getStudentId());
					System.out.println("Name :  "+s.getStudentName());
					System.out.println("City :  "+s.getStudentCity());
					System.out.println("************************");
					
				}
				break;
			case 3:
				//to display single student
				System.out.println("************************");
				System.out.println("Enter user userid : ");
				int Id = Integer.parseInt(br.readLine());
				
				Student s = studentDao.getStudent(Id);
				System.out.println("Id :    "+s.getStudentId());
				System.out.println("Name :  "+s.getStudentName());
				System.out.println("City :  "+s.getStudentCity());
				System.out.println("************************");
				break;
			case 4:
				//to delete student
				System.out.println("************************");
				System.out.println("Enter user userid : ");
				int Idu = Integer.parseInt(br.readLine());
				studentDao.deleteStudent(Idu);
				System.out.println(Idu+ "Deleted successfully");
				System.out.println("************************");
				break;
			case 5:
				//to update student
				System.out.println("************************");
				System.out.println("Enter user userid to update: ");
				int uid = Integer.parseInt(br.readLine());
				studentDao.getStudent(uid);
				
				System.out.println("*******");
			
				System.out.println("Enter new user userName : ");
				String userNa = br.readLine();
				
				System.out.println("Enter new user userCity : ");
				String userCi = br.readLine();
				
				//creating student object and setting values 
				Student st=new Student(uid,userNa,userCi);
				studentDao.update(st);
				
				System.out.println(" succesfully updated to " +uid);
				
				System.out.println("************************");
				break;
			case 6:
				//to exit from while loop
				go=false;
				break;
		
			}
        	   
			
		} catch (Exception e) {
			
			System.out.println("Invalid input Try with another one");
			System.out.println(e.getMessage());
		}
           
       }
       System.out.println("Thankyou for using my application");
       System.out.println("See you soon !!");
    }
}
