package com.vijay.LamdaAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment6OfLambda {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
	    list1.add("vijay");
	    list1.add("ajay");
	    list1.add("sanjay");
	    list1.add("akash");
	    list1.add("rakhi");
	    list1.add("amit");
	    System.out.println(list1);
	    
	    UnaryOperator<String> unaryOpt = s->s.toUpperCase();
		list1.replaceAll(unaryOpt);
		
	    System.out.println(list1);
	    

	}

}
