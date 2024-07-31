package StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with credit card
        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCard);
        context.pay(250.75);

        // Paying with PayPal
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com", "password");
        context.setPaymentStrategy(payPal);
        context.pay(89.99);
    }
}

