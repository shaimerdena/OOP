package problem3.bank.model;

public abstract class Account {
	private double balance; 
	private int accNumber;
	
	public Account(int acc){
		this.accNumber = acc;
	}
	
	public boolean deposit(double sum) {
		if(sum > 0) {
			this.balance += sum;
			return true;
		}
		return false;
	}

	public boolean withdraw(double sum) {
		if(this.balance - sum >= 0) {
			this.balance -= sum;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	
	public boolean transfer(double amount, Account other) {
		if(this.balance - amount >= 0) {
			this.withdraw(amount);
			other.deposit(amount);
			return true;
		} else {
			System.out.print("Transfer failed.");
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Account number: " + this.getAccNumber() + "\n" +
				"Account balance: " + this.getBalance() + "\n";
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
