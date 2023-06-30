package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);
//        JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
//        String query="insert into student(id,name,city) values(?,?,?)";
        
        //fire query
//        int result = template.update(query,51,"Rahul Sardeshmukh","Banglore");
//        System.out.println("Number of record inserted.."+ result);
        
        StudentDao studentdao = context.getBean("studentdao",StudentDao.class);
        
//        Student stu=new Student();
//        stu.setId(52);
//        stu.setName("Rehana");
//        stu.setCity("Latur");
//        int insert = studentdao.delete(52);
//        System.out.println("Data deleted "+ insert);
//        Student stu=studentdao.getStudent(50);
//        System.out.println(stu);
          List <Student> stu=studentdao.getAllStudents();
          for(Student s:stu)
          {
        	  System.out.println(s);
          }
        
    }
}
