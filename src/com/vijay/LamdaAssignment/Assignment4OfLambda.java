package com.vijay.LamdaAssignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment4OfLambda {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
	    list1.add("vijay");
	    list1.add("ajay");
	    list1.add("sanjay");
	    list1.add("akash");
	    list1.add("rakhi");
	    list1.add("amit");
	    System.out.println(list1);
	
	     list1.removeIf(n->(n.length()%2!=0))  ;
	   for(String l:list1){
        System.out.println(l);		   
	   }
	     
	    
	    
	   
	}
}
