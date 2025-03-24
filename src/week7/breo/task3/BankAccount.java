package week7.breo.task3;

public abstract class BankAccount {
	protected double Amount;
	protected double time;
	public BankAccount(double Amount, double time){
		this.Amount = Amount;
		this.time =time;
	}
	public abstract double calculateInterest();
}
