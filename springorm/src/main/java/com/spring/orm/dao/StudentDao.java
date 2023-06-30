package com.spring.orm.dao;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	//save student
	@Transactional
	public int insert(Student student)
	{
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	//get singel object
	public Student getStudent(int studentId) {
		Student stu=hibernateTemplate.get(Student.class, studentId);
		return stu;
	}
	//get all students
	public List<Student> getAllStudents(){
	List<Student> stu=this.hibernateTemplate.loadAll(Student.class);
		return stu;
	}
	
	//delete student
	@Transactional
	public void deleteStudent(int studentId) {
		Student stu=hibernateTemplate.get(Student.class, studentId);
		hibernateTemplate.delete(stu);
	}
	
	//update student
	@Transactional
	public void update(Student stu) {
		hibernateTemplate.update(stu);
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
