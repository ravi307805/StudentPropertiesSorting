package com.te.demo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentComparatorMain {

	public static void main(String[] args) {

		HashSet<StudentComparator> set = new HashSet<StudentComparator>();
		set.add(new StudentComparator(1, "Ravi", 95.5, 23));
		set.add(new StudentComparator(2, "Ranjan", 77.0, 24));
		set.add(new StudentComparator(9, "Pandey", 85.2, 20));
		set.add(new StudentComparator(5, "Abhishek", 99.9, 26));
		set.add(new StudentComparator(3, "Abhishek", 100, 26));
		set.add(new StudentComparator(2, "Shyam", 97.0, 46));
		ArrayList<StudentComparator> arrayList = new ArrayList<StudentComparator>(set);

		Scanner sc = new Scanner(System.in);
		int key;
		do {
			System.out.println("Enter 1 to sort by Id");
			System.out.println("Enter 2 to sort by name");
			System.out.println("Enter 3 to sort by age");
			System.out.println("Enter 4 to sort by marks");
			 key = sc.nextInt();

			switch (key) {
			case 1:
				System.out.println(new SortById());
				Collections.sort(arrayList, new SortById());
				for (StudentComparator studentComparator : arrayList) {
					System.out.println(studentComparator);
				}
				System.out.println(arrayList);
				break;

			case 2:
				System.out.println(new SortByName());
				Collections.sort(arrayList, new SortByName());
				for (StudentComparator studentComparator : arrayList) {
					System.out.println(studentComparator);
				}
				System.out.println(arrayList);

				break;

			case 3:
				System.out.println(new SortByAge());
				Collections.sort(arrayList, new SortByAge());
				for (StudentComparator studentComparator : arrayList) {
					System.out.println(studentComparator);
				}
				System.out.println(arrayList);

				break;

			case 4:
				System.out.println(new SortByMarks());
				for (StudentComparator studentComparator : arrayList) {
					System.out.println(studentComparator);
				}
				System.out.println(arrayList);

				break;

			default:
				try {
					if (key>4) {
						throw new StudentComparatorException("Invalid number");
					}
				} catch (StudentComparatorException e) {

				System.out.println(e.getMessage());
				}
				
				
			}
			System.out.println("Do you want to continue. Press 1 to continue and 2 to exit");
			key = sc.nextInt();
		} while (key == 1);

	}

}
