package com.vijay.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList {
	public static void main(String[] args) {
		
		Employee1 e1 =new Employee1(1, "vijay", "capgemini");
		Employee1 e2 =new Employee1(2, "ajay", "capgemini");
		Employee1 e3 =new Employee1(3, "sanjay", "wipro");
		Employee1 e4 =new Employee1(4, "ranjay", "tcs");
		
		
		
		Account1 a1 = new Account1("vijay", 1242, "saving");
		Account1 a2 = new Account1("vijay", 1242, "saving");
		Account1 a3 = new Account1("vijay", 1242, "saving");
		
		
		MyGList<Employee1> list1 = new MyGList<Employee1>();
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
	//	list1.remove(e1);
//		System.out.println("-hi---");
//	System.out.println(list1.get(1));	
		
//		ArrayList<Account1> list2 =new ArrayList<Account1>();
//		list2.add(a1);
//		list2.add(a2);
//		list2.add(a3);
//	//	list2.add(e1);
		
	
//		
//		
//		System.out.println("--------------------------------------------");
//		
//		Iterator itr2=list2.iterator();
//		while (itr2.hasNext()) {
//		System.out.println(itr2.next()+"");
//		}
		
	}
}
