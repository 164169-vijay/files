package com.vijay.assignment4;

import java.util.HashMap;
import java.util.Map.Entry;

public class DateDriver {

	public static void main(String[] args) {
		Date d1 = new Date(21,"mar", 1996);
		Date d2 = new Date(21,"mar", 1997);
		Date d3 = new Date(25,"jan", 1997);
		Date d4 = new Date(26,"apr", 1995);
		

		HashMap<Date,String> emap= new HashMap<Date, String>();
		emap.put(d1,"vijay");
		emap.put(d2,"ajay");
		emap.put(d3,"sanjay");
		emap.put(d4,"digvijay");
		
		for (Entry<Date, String> m:emap.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
		
	}

}
