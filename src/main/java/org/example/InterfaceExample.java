package org.example;

 interface Payment {
    void processPayment(double amount);
}

 class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

 class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(100.0);

        Payment payment2 = new PayPalPayment();
        payment2.processPayment(200.0);
    }
}

