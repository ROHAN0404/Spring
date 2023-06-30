package com.student;

class College {
	int faculty=27;
	College() {
		System.out.println("this is faculty");
	}
	College(int faculty){
		this.faculty=faculty;
	}
	void teach() {
		System.out.println("Faculty teaches well " +faculty);
	}
}
public class Student extends College{
	int x,y;
	
	Student()
	{
		
		super(26);
		super.teach();
		System.out.println("Student constructer");
	}
	Student(int x,int y)
	{
		this();
		this.x=x;
		this.y=y;
	}
	void add()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		new Student();
		Student stu = new Student(10,20);
		stu.add();
		College col=new College();
		col.teach();
		
		
	}

}
