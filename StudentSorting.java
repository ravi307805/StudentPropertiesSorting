package com.te.demo.arraylist;

public class StudentSorting implements Comparable<StudentSorting>{
	
	int id;
	String name;
	int age;
	
	public StudentSorting(int id, String name, int age) {

		this.id=id;
		this.name=name;
		this.age=age;
	
	}

	

	@Override
	public int compareTo(StudentSorting o) {

		return this.id-o.id;
	}



	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	

}
