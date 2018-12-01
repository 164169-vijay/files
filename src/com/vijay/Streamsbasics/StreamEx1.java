package com.vijay.Streamsbasics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx1 {

		public static void main(String[] args) {
				
		String arr1[]={"aa","bb","cc","dd"};
		   //to create stream of array
		Stream<String> stream1=Arrays.stream(arr1);
		stream1.forEach(System.out::println);
		
		
		ArrayList<String> l=new ArrayList<>();
		l.add("vijay");
		l.add("ajay");
		l.add("kumar");
		l.add("amit");
		System.out.println(l);
		
	//to create stream of list//////////////////////////////////
		Stream<String> stream2=l.stream();
		stream2.forEach(System.out::println);
		
		
	//to do intermidiate or terminal operation on stream/////////////
		
		
		
	}
	
}
