package com.vijay.basicEx;

public class Person implements Comparable {
	int weight;
	int height;
	String name;

	public Person(int weight, int height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(person per) {
		 if (this.weight==per.) {
             return 0;
         } else if (this.empId < emp.getEmpId()) {
             return -1;
         }
         
	}


}
