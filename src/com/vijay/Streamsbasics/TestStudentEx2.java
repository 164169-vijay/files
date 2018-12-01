package com.vijay.Streamsbasics;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestStudentEx2 {

	public static void main(String[] args) {
        	
	//multiprocessing of streams	
		StudentEx2 s1=new StudentEx2("vijay", 23);
		StudentEx2 s2=new StudentEx2("kumar", 23);
		StudentEx2 s3=new StudentEx2("ratan", 23);
		StudentEx2 s4=new StudentEx2("amit", 23);
		
		ArrayList<StudentEx2> list1= new ArrayList<StudentEx2>();
	    list1.add(new StudentEx2("vijay", 23));
	    list1.add(s2);
	    list1.add(s3);
	    list1.add(s4);
	       
	    Stream<StudentEx2> stream3=list1.parallelStream();
	    stream3.forEach(s->doProcess(s));

	}

	private static void doProcess(StudentEx2 s) {
		System.out.println(s);
	}
}
