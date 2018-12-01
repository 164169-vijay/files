package com.vijay.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
	
	public static void main(String[] args) {
		
	
	List<String> place = new ArrayList<String>();
	

	place.add("karwar");
	place.add("bangalore");
	place.add("ankola");
	place.add("margoa");
	

	
	Iterator<String> lt = place.listIterator();

	
	System.out.println("----List in Reverse direction----");
	while (lt.hasPrevious()) {
		System.out.println(lt.previous());
	
	}
	
}
}

