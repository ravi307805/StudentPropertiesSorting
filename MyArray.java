package com.te.demo.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray implements Iterable {
	private Object[] array;
	private int position;
	
	public MyArray(int arraysize) {
		array = new  Object[arraysize];
	}
	
	public void add(Object object) {
		array[position++]= object;
	}
	
	public int size() {
		return this.position;
	}
	
	public Object get(int index) {
		return array[index];
	}

	@Override
	public String toString() {
		if (size()==0) {
			return  "[]";
		}
		String string = "["+array[0];
		for (int i = 1; i < size(); i++) {
			string += ","+ array[i];
		}
		string +="]";
		return string;
	
	}
	
	private void grow() {
		Object[] temp=new Object[array.length+3];
		for (int i = 0; i < array.length; i++) {
			 temp[i]=array[i];
			
	}
		
//		System.arraycopy(array, 0, temp, 0, array.length);
//		array=temp;
		
		
		
		
	}
	
	

	@Override
	public Iterator iterator() {
		return new MyItr();
	}
	
	private class MyItr implements Iterator{
		int index;
		
		
	@Override
		public void remove() {
		
		Iterator.super.remove();
		}



	@Override
	public boolean hasNext() {
		return (position > index) ? true : false;
			
		}
	
		

	@Override
	public Object next() {
		return array[index++];
	}
	
	
	
	
	
	}
}
