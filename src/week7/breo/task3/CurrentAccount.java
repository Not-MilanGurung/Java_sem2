package week7.breo.task3;

public class CurrentAccount extends BankAccount {
	private double rate = 4.2;
	public CurrentAccount(double amount, double time){
		super(amount, time);
	}

	@Override
	public double calculateInterest() {
		double interest = (Amount * time * rate)/100.0;
		return interest;
	}
}
