package com.vijay.generics;

public class Employee1 {

	int eid;
	String ename;
	String ecomp;
	public Employee1(int eid, String ename, String ecomp) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecomp = ecomp;
	}
	
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", ecomp="
				+ ecomp + "]";
	}
	
	
	
}
