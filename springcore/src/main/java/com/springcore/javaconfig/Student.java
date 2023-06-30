package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	private Samosa samosa;
		public void study()
		{
//			this.samosa.display();
			System.out.println("Student is studying");
		}
	public Student(Samosa samosa) {
			super();
			samosa.display();
			this.samosa = samosa;
		}
}
