package com.te.demo.arraylist;

import java.util.Comparator;

public class SortByMarks implements Comparator<StudentComparator>{

	int s=(int)marks;
	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		
		return o1.marks-o2.marks;
	}
	

}
