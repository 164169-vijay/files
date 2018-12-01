package com.vijay.assignment1;

import java.util.*;

public class DriverClass {

	public static void main(String[] args) {
		
		
		
		 Person per1 = new Person(60, 5, "vijay");
		 Person per2 = new Person(61, 6, "ajay");
		 Person per3 = new Person(62, 5, "amar");
		 Person per4 = new Person(63, 6, "vinay");
		 Person per5 = new Person(64, 7, "tanmay");
		 Person per6 = new Person(65, 5, "sameer");
		 
		 
	 Set<Person> st=new TreeSet<Person>();
		 st.add(per1);
		 st.add(per2);
		 st.add(per3);
		 st.add(per4);
		 st.add(per5);
		 st.add(per6);
		 
		 for(Person per : st)
			 per.display();
			 
		 
	}	
}
