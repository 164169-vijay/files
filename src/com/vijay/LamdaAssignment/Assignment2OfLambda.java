package com.vijay.LamdaAssignment;

import java.util.Scanner;
import java.util.function.Predicate;

public class Assignment2OfLambda {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the order value please");
	    double value=sc.nextDouble();
	   
	     Predicate<Double> valueOfOrder=ordervalue->(ordervalue>=10000);

	    if (valueOfOrder.test(value) ) {
		System.out.println("Your order is accepted");
	} else {
              System.out.println("your order is declined");
		}   
    }		
}
