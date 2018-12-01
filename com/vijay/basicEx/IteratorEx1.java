package com.vijay.basicEx;

import java.util.ArrayList;
import java.util.Iterator;

//use of Iterator in java
public class IteratorEx1 {
	
	public static void main(String[] args) {

		ArrayList list =new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("------Elements are----------");
		
    	Iterator itr=list.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next()+"");
		}
	}
}
