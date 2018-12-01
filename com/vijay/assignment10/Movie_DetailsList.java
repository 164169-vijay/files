package com.vijay.assignment10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

//add_movie(), remove_movie(),
//remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()

public class Movie_DetailsList {

	 public static void main(String[] args) {
		
	
	Movie_Details det1 = new Movie_Details("RAVAN", "SHARUKH", "KARINA", "ROMANTIC");
	Movie_Details det2 = new Movie_Details("KALA", "RAJKUMAR", "KARINA", "ACTION");
	Movie_Details det3 = new Movie_Details("TOH", "AAMIR", "KATRINA", "THRILL");
	Movie_Details det4 = new Movie_Details("GOT", "NICOLAS", "JANIFFER", "DRAMA");
	
	 ArrayList<Movie_Details> list = new ArrayList<Movie_Details>(); 
       list.add(det1);
       list.add(det2);
       list.add(det3);
       list.add(det4);
       
   	System.out.println("------Elements are----------");
	Iterator itr=list.iterator();
	while (itr.hasNext()) {
	System.out.println(itr.next()+"");
	
	System.out.println("How to sort"
			+ "1.Movie name"
			+ "2.Genre"
			+ "3.");
	
}
}}