package week3.breo.practical;
import week2.BankAccount;
public class BankAccountWithConnection extends BankAccount {

    public BankAccountWithConnection(String accountNumber, double startingBalance) {
        super(accountNumber, startingBalance);
    }

    public boolean transfer(double amount, BankAccountWithConnection otherAccount){
        if (amount <= 0.0){
            System.out.println("Invalid amount");
            return false;
        }
        if (this.balance < amount){
            System.out.println("Insufficient amount");
            return false;
        }
        if (otherAccount == null){
            System.out.println("No account specified");
            return false;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return true;
    }

    public static void main(String[] args) {
        BankAccountWithConnection b1 = new BankAccountWithConnection("12321Afd2", 10_000.0);
        BankAccountWithConnection b2 = new BankAccountWithConnection("1232122", 20_000.0);
        b1.displayAccountDetails();
        b2.displayAccountDetails();
        b2.transfer(5_000, b1);
        b1.displayAccountDetails();
        b2.displayAccountDetails();
    }
    
}
