package com.vijay.LamdaAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment5OfLambda {

	public static void main(String[] args) {
		
	
		
		List<String> ls=new ArrayList<String>();

		 ls.add("vijay");
		 ls.add("ajay");
		 ls.add("sanjay");
		 ls.add("ranjay");
		 ls.add("dhananjay");
		 ls.add("amit");
		 
//		 Consumer<List<Integer> > modify = list -> {       for (int i = 0; i < ls.size(); i++) 
//                    }; 
	 
		 
	//	 StringBuilder sb=new StringBuilder("");
		 
//		 List<String> newstring = ls.stream().map(n -> (n.replace(n, n.substring(0, 1)))).collect(Collectors.toList());
//			System.out.println(newstring);

	//	 Comparator<String> comparator = Comparator.comparing(String::compareToIgnoreCase);
		 Stream<String> stream111=ls.stream();
		 System.out.println("--------comparision on basis of alphabet--------");
		 stream111.sorted(String::compareToIgnoreCase).forEach(System.out::println);
		 
		System.out.println("or it can be done as--------------");
		 ls.stream().sorted()
		 .forEach(a->System.out.println(a));
		 
	//	 System.out.println(naTrades);
		 
		 		//int x=ls.sort((p1, p2) -> p1.compareTo(p2));
//		 List<String> result = ls.stream().sorted(
//                 Comparator.comparing(n->n.toString())).collect(Collectors.toList());
//				
		 
		
		 
		 
	}



}
			