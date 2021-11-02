package com.te.demo.arraylist;

import java.util.Comparator;

public class SortByAge implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.age-o2.age;
	}

	
	
}
