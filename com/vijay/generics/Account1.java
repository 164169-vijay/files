package com.vijay.generics;

public class Account1 {

	String accHolderName;
	int accHolderId;
	String accType;
	public Account1(String accHolderName, int accHolderId, String accType) {
		super();
		this.accHolderName = accHolderName;
		this.accHolderId = accHolderId;
		this.accType = accType;
	}
	
	@Override
	public String toString() {
		return "Account1 [accHolderName=" + accHolderName + ", accHolderId="
				+ accHolderId + ", accType=" + accType + "]";
	}
	
	
	
}
