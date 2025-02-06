package week2;

/**
 * This class consists of two instance variables
 * 
 *  {@link #accountNumber} the account number of in String
 *  {@link #balance} the balance of account in double
 *  
 * 
 */
public class BankAccount {
	protected String accountNumber;
	protected double balance;
	/**
	 * Deposits the amount into the account
	 * @param amount double data type, must be greater than 0
	 */
	protected void deposit(double amount) {
		if(amount <= 0.0f) {
			System.out.println("[ERROR]: Error value from deposit amout:" +amount);
		}
		this.balance += amount;
	}
	/**
	 * Prints the values of {@link #balance} and {@link #accountNumber}
	 */
	protected void displayAccountDetails() {
		System.out.println("The account no. is "+this.accountNumber);
		System.out.println("The balance is "+this.balance);
	}
	
	/**
	 * Constructor of the Class
	 * 
	 * @param accountNumber sets the value of {@link #accountNumber}
	 * @param startingBalance sets the initial value of {@link #balance}
	 */
	public BankAccount(String accountNumber, double startingBalance) {
		if (accountNumber == null || accountNumber.isEmpty()) {
			System.out.println("[ERROR]: Account number can not be empty");
		}
		this.accountNumber = accountNumber;
		this.balance = startingBalance;
	}
	
	public static void main(String[] args) {
		
		BankAccount holder1 = new BankAccount("Abd123451", 35367.0);
		holder1.displayAccountDetails();
		holder1.deposit(1000.0);
		holder1.displayAccountDetails();
		
	}

}
