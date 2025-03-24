package week7.breo.task3;

public class Test {
	public static void main(String[] args) {
		BankAccount b1 = new SavingsAccount(100000, 3);
		BankAccount b2 = new CurrentAccount(100000, 3);
		System.out.println("Interest in savings account= "+b1.calculateInterest());	
		System.out.println("Interest in current account= "+b2.calculateInterest());	
	}	
}
