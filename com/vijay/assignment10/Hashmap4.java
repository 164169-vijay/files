package com.vijay.assignment10;

import java.util.HashMap;
import java.util.Map;

import com.vijay.assignment5.Employee;

public class Hashmap4 {

	
	public static void main(String[] args) {
		Hashmap4 emp = new Hashmap4(100, "sneha");
		Hashmap4 emp1 = new Hashmap4(100, "sneha");
		Hashmap4 emp2 = new Hashmap4(101, "swathi");
		Hashmap4 emp3 = new Hashmap4(102, "shreya");
		Hashmap4 emp4 = new Hashmap4(103, "shiv");
		
		Map<Hashmap4, String> map = new HashMap<Hashmap4, String>(); 
        map.put(emp, "CSE"); 
        map.put(emp1, "IT"); 
        map.put(emp2, "EEE");
        //map.put(emp3, "ECE");
        //map.put(emp4, "ECE");
          
        for(Employee employee : map.keySet()) 
        { 
            System.out.println(emp.equals(emp1));
            System.out.println(emp3.equals(emp4));
            
            System.out.println(emp.hashCode());
            System.out.println(emp1.hashCode());
            System.out.println(emp2.hashCode());
            System.out.println(emp3.hashCode());
            System.out.println(emp4.hashCode());
            
            System.out.println(emp);
            System.out.println(emp1);
            System.out.println(emp2);
            System.out.println(emp3);
            System.out.println(emp4);
            //map.put(emp1, "EEE");
            System.out.println(map.get(employee).toString());
            System.out.println();
            
        } 
	}
	
	
	
	
	
	
	
}
