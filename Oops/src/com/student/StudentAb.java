package com.student;

interface College1
{
	 void subject();
}
public class StudentAb implements College1{

	public StudentAb() 
	{
		System.out.println("Yes I am constructor");
	}

	public void subject()
	{
		
		System.out.println("Subjects ");
		
	}
	public static void main(String[] args) {

		College1 col= new StudentAb();
		col.subject();
		StudentAb ab= new StudentAb();
		ab.subject();
	}

	

}
