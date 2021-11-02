package com.te.demo.arraylist;

import java.util.Comparator;

public class StudentComparator  {
	
	int  id;
	String name;
	double marks;
	int age;
	
	public StudentComparator(int id, String name, double marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentComparator [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		StudentComparator sc= (StudentComparator)obj;
		return this.id==sc.id;
	}
	

	

}
