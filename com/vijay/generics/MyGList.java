package com.vijay.generics;

import java.util.ArrayList;

class MyGList<T>

{
	 
	
	private T t;
	
	public void add(T t){
		this.t=t;
		
	}
	
	ArrayList<T> arr=new ArrayList<T>();
	 
	public void add( ) {
	 arr.add(t);

	}
	
	public void remove(T t) {
		arr.remove(t);
	}
	 
	
	
	
	
}
