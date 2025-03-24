package week7.breo.task6;

import java.util.Scanner;

abstract class Payment {
    abstract void processPayment(double amount);

    final void generateReceipt(double amount) {
        System.out.println("Receipt generated for amount: $" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
        generateReceipt(amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
        generateReceipt(amount);
    }
}

class UPIPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI Payment of $" + amount);
        generateReceipt(amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment method (CreditCard, PayPal, UPI): ");
        String method = scanner.next();

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        Payment payment;

        switch (method.toLowerCase()) {
            case "creditcard":
                payment = new CreditCardPayment();
                break;
            case "paypal":
                payment = new PayPalPayment();
                break;
            case "upi":
                payment = new UPIPayment();
                break;
            default:
                System.out.println("Invalid payment method!");
                scanner.close();
                return;
        }

        payment.processPayment(amount);
        scanner.close();
    }
}
