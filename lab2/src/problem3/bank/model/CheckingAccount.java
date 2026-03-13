package problem3.bank.model;

public class CheckingAccount extends Account {
	private int numberOfTransactions;
	private static final int FREE_TRANSACTIONS = 5;
	private static final double FEE = 0.02;
	
	public CheckingAccount(int acc) {
		super(acc);
	}
	
	private boolean incrementTransaction(boolean success) {
		if(success) this.numberOfTransactions++;
		return success;
	}
	
	@Override
	public boolean deposit(double sum) {
		return this.incrementTransaction(super.deposit(sum));
	}
	
	@Override
	public boolean withdraw(double sum) {
		return this.incrementTransaction(super.withdraw(sum));
	}
	
	@Override
	public boolean transfer(double amount, Account other) {
		return this.incrementTransaction(super.transfer(amount, other));
	}

	public int getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public static int getFREE_TRANSACTIONS() {
		return FREE_TRANSACTIONS;
	}
	
	public void deductFee() {
		int extraTransactions = this.getNumberOfTransactions() - FREE_TRANSACTIONS;
		if(extraTransactions > 0) {
			super.withdraw(extraTransactions * FEE);
		}
	}
	
	public String toString() {
		return super.toString() + 
				"Number of transactions: " + this.getNumberOfTransactions() + "\n";
	}
}
