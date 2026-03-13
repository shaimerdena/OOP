package problem3.bank.app;

import problem3.bank.model.Account;
import problem3.bank.model.Bank;
import problem3.bank.model.CheckingAccount;
import problem3.bank.model.SavingsAccount;

public class BankTest {
	public static void main(String[] args) {
		Account a1 = new CheckingAccount(0);
		Account a2 = new SavingsAccount(1, 3);
		
		Bank b = new Bank();
		b.openAccount(a1);
		b.openAccount(a2);
		
		a1.withdraw(10000);
		a1.deposit(3500);
		a1.transfer(2000, a2);
		a1.withdraw(100);
		a1.transfer(100, a2);
		
		b.update();
		
		b.printAccounts();
	}
}
