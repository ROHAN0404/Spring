package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stu=context.getBean("getStudent",Student.class);
		System.out.println(stu);
		
		stu.study();
	}

}
