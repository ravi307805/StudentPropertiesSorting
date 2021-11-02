package com.te.demo.arraylist;

import java.util.Iterator;

public class MyArrayImpl {

	public static void main(String[] args) {
		MyArray array=new MyArray(3);
		array.add(20);
		array.add(50);
		array.add(10);
		
		System.out.println();
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
			
			
			
		}
		
		System.out.println(array);
		System.out.println("----Using Iterator----");
		Iterator iterator=array.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}
		System.out.println("----Foreach-----");
		
		for(Object object : array) {
			System.out.println(object);
		}
	}

}
