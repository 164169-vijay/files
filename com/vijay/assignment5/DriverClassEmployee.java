package com.vijay.assignment5;

import java.util.Hashtable;

public class DriverClassEmployee {

	public static void main(String[] args) {
	
		Hashtable<Employee, Integer> hashtable=new Hashtable<Employee, Integer>();
		System.out.println(hashtable.put(new Employee("vijay", 50000), 1));
		System.out.println(hashtable.put(new Employee("ajay", 60000), 2));
		System.out.println(hashtable.get(new Employee("vijay", 50000)));
		
		

	}

}
