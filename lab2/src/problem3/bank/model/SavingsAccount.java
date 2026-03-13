package problem3.bank.model;

public class SavingsAccount extends Account {
	private int interestRate;
	
	public SavingsAccount(int acc, int rate) {
		super(acc);
		this.interestRate = rate;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void addInterest() {
		double interest = this.getBalance() * this.interestRate/100;
		this.withdraw(interest);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Interest rate: " + this.getInterestRate() + "\n";
	}
}
