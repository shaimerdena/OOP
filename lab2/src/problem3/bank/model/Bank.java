package problem3.bank.model;

import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;
	
	public Bank() {
		accounts = new Vector<>();
	}
	
	public void openAccount(Account acc) {
		accounts.add(acc);
	}
	
	public void update() {
		for(Account acc : accounts) {
			if(acc instanceof SavingsAccount) {
				((SavingsAccount) acc).addInterest();
			}
			else if(acc instanceof CheckingAccount) {
				((CheckingAccount) acc).deductFee();
			}
		}
	}
	
	public void closeAccount(int accNumber) {
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getAccNumber() == accNumber) {
				accounts.remove(i);
				break;
			}
		}
	}
	public void printAccounts() {
		for(Account acc : accounts) {
			acc.print();
		}
	}
}
