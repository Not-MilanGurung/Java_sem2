package week7.breo.task3;

public class SavingsAccount extends BankAccount {
	private double rate = 11.4;
	public SavingsAccount(double amount, double time){
		super(amount, time);
	}

	@Override
	public double calculateInterest() {
		double interest = (Amount * time * rate)/100.0;
		return interest;
	}
}
