package com.vijay.streamsAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("mango",     150,  10, "orange");
		Fruit f2 = new Fruit("apple",     70,   8, "red");
		Fruit f3 = new Fruit("banana",    160,   5, "yellow");
		Fruit f4 = new Fruit("stawberry", 80,   15, "red");
		Fruit f5 = new Fruit("grapes ",   140,    7, "orange");
		
		List<Fruit> fruitList =new ArrayList<Fruit>();
	    fruitList.add(f1);
	    fruitList.add(f2);
	    fruitList.add(f3);
	    fruitList.add(f4);
	    fruitList.add(f5);
		
	//	stream.filter(i -> i%2 == 0).forEach(System.out::println);
	    //Stream<String> stream2=l.stream();
	
	    Stream<Fruit> stream1=fruitList.stream();
	    
	    Stream<Fruit> stream2=fruitList.stream();
	    
	    Stream<Fruit> stream3=fruitList.stream();
	    
	    
	    stream1.filter(c->c.getCalories()>100).forEach(System.out::println);
	    
	    System.out.println("group by colors");
	    
	    stream2.sorted((c1,c2)->((c1.getColor()).compareTo(c2.getColor()))).forEach(System.out::println);
	    
	   System.out.println("-----------------------------------------------");
	   
	   stream3.filter(c->(c.getColor()=="red")).forEach(System.out::println);

	    
	    //News n1 = new News();
	   
	   Trader t1 = new Trader("vijay", "dhanbad");
	   Trader t2 = new Trader("ajay", "pune");
	   Trader t3 = new Trader("sanjay", "ranchi");
	   Trader t4 = new Trader("digvijay", "pune");
	   Trader t5 = new Trader("dhananjay", "delhi");
	   Trader t6 = new Trader("ashutosh", "indore");
	   
	   
	   List<Trader> traderList =new ArrayList<Trader>();
	   traderList.add(t1);
	   traderList.add(t2);
	   traderList.add(t3);
	   traderList.add(t4);
	   traderList.add(t5);
	   traderList.add(t6);
	        
	   
	   Stream<Trader> stream4=traderList.stream();
	   Stream<Trader> stream5=traderList.stream();
	   Stream<Trader> stream6=traderList.stream();
	   Stream<Trader> stream7=traderList.stream();
	   Stream<Trader> stream9=traderList.stream();
	   System.out.println("distinct cities");
	   stream4.map(Trader::getCity).distinct().forEach(System.out::println);
	   
	   
	   System.out.println("pune traders");
	   stream5.filter(c->(c.getCity()=="pune")).forEach(System.out::println);
	   
//	   
//	   System.out.println("traders by name");
//	   stream6.map(Trader::getName).forEach(System.out::println);
//	   
	   System.out.println("indore match");
	   System.out.println("----------------------------------------");
	                 boolean   getmatch  =  stream7.anyMatch(s->s.getCity()=="indore");
	                    System.out.println(getmatch);
	                    
	                    
	             Transaction tr1 = new Transaction(t1, 2011, 8000);
	             Transaction tr2 = new Transaction(t2, 2012, 9000);
	             Transaction tr3 = new Transaction(t3, 2013, 7000);
	             Transaction tr4 = new Transaction(t4, 2014, 6700);
	             Transaction tr5 = new Transaction(t5, 2011, 8600);
	             Transaction tr6 = new Transaction(t6, 2013, 6700);
	             
	             List<Transaction>  lt=new ArrayList<Transaction>();
	             lt.add(tr1);
	             lt.add(tr2);
	             lt.add(tr3);
	             lt.add(tr4);
	             lt.add(tr5);
	             lt.add(tr6);
	             
	          System.out.println("------------------------------------------------------------------");
	             System.out.println("question 13");
	             Stream<Transaction> stream11=lt.stream();
	             stream11.filter(c->(c.getTrader().getCity()=="delhi")).collect(Collectors.toList());
	             System.out.println(stream11);
	             
	             System.out.println("---question14--------------------");
	             
	             
	            
	             
	             
	                    
	                    
	                    
	       	}
}
