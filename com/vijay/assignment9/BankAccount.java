package com.vijay.assignment9;

public class BankAccount {

	String accHolderName;
	double accBalance;
	int accNo;
	public BankAccount(String accHolderName, double accBalance, int accNo) {
		super();
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	@Override
	public String toString() {
		return "BankAccount [accHolderName=" + accHolderName + ", accBalance="
				+ accBalance + ", accNo=" + accNo + "]";
	}
}
