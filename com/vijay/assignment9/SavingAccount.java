package com.vijay.assignment9;

public class SavingAccount implements Comparable<SavingAccount> {
	public int acc_balance;
	public int acc_id;
	public String accHolderName;
	public boolean isSalaryAccount;

	public SavingAccount(int acc_balance, int acc_id, String accHolderName,
			boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.accHolderName = accHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public double withdraw(double amount) {
		acc_balance -= amount;
		return acc_balance;

	}

	public double deposit(double amount) {
		acc_balance += amount;
		return acc_balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_id="
				+ acc_id + ", accHolderName=" + accHolderName
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	@Override
	public int compareTo(SavingAccount savingaccount) {

		if (this.acc_id == savingaccount.getAcc_id()) {
			return 0;
		} else if (this.acc_id > savingaccount.getAcc_id()) {

			if (this.accHolderName == savingaccount.getAccHolderName()) {
				return 0;
			} else {
				return 1;
			}
		} else
			return -1;
	}

	public void display() {
		System.out.println("The account id is " + getAcc_id()
				+ "  The account balance is " + getAcc_balance()
				+ "   The name is " + getAccHolderName());

	}
}
