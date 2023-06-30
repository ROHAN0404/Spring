package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		Person person1=context.getBean("person1",Person.class);
		System.out.println(person1.getFriends());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("_______________________________________");
		System.out.println(person1.getFeeStructure());
		System.out.println(person1.getFeeStructure().getClass().getName());
		
		System.out.println("_______________________________________");
		System.out.println(person1.getProps());
		System.out.println(person1.getProps().getClass().getName());
		}

}
