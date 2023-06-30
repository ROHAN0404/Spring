package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certi certi;
	private List<String> phones;
	
	public Person(String name,int personId,Certi certi,List<String> phones)
	{
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		this.phones=phones;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personId +"{ " +this.certi.name +"}"+":" +this.phones;
	}
}
