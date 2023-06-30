package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
		Student student=context.getBean("stu",Student.class);
		System.out.println(student.hashCode());
		
		Student student1=context.getBean("stu",Student.class);
		System.out.println(student1.hashCode());
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
		
		System.out.println("____________________________________________");
		ApplicationContext context1=new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
		Parent par=context1.getBean("par",Parent.class);
		System.out.println(par.hashCode());
		Parent par1=context1.getBean("par",Parent.class);
		System.out.println(par1.hashCode());
	}

}
