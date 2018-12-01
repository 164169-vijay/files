package com.vijay.assignment9;

import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		
		TreeSet<SavingAccount> sacc = new TreeSet<SavingAccount>();
		SavingAccount saving1 = new SavingAccount(500000, 1, "vijay", true);
		SavingAccount saving2 = new SavingAccount(5500000, 2, "ajay", true);
		SavingAccount saving3 = new SavingAccount(5200000, 2, "kumar", true);
		SavingAccount saving4 = new SavingAccount(5100000, 4, "rakhi", true);
		SavingAccount saving5 = new SavingAccount(5400000, 5, "Priti", true);
		SavingAccount saving6 = new SavingAccount(5400000, 6, "amit", true);

		sacc.add(saving1);
		sacc.add(saving2);
		sacc.add(saving3);
		sacc.add(saving4);
		sacc.add(saving5);
		sacc.add(saving6);

		for (SavingAccount savingaccount : sacc) {
			savingaccount.display();
		}


	}
	
}
