package com.te.demo.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingMain {

	public static void main(String[] args) {
		ArrayList<StudentSorting> arrayList=new ArrayList<StudentSorting>();
		arrayList.add( new StudentSorting(1,"Ravi", 23));
		arrayList.add( new StudentSorting(2,"Ranjan", 27));
		arrayList.add( new StudentSorting(9,"Pandey", 25));
		arrayList.add( new StudentSorting(5,"Abhishek", 26));
		
		System.out.println(arrayList);
		
		for ( StudentSorting studentSorting : arrayList) {
			System.out.println(studentSorting);
		}
		
		Collections.sort(arrayList);
		for ( StudentSorting studentSorting : arrayList) {
			System.out.println(studentSorting);
		}
		System.out.println(arrayList);
		
	}
}
