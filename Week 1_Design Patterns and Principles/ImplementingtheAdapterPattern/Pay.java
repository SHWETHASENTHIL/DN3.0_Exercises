package ImplementingtheAdapterPattern;

public class Pay implements PaymentProcessor {
    private Paymentgateway paymentGateway; // Renamed to follow convention

    public Pay(Paymentgateway paymentGateway) {
        this.paymentGateway = paymentGateway; // Fixed naming consistency
    }

    @Override
    public void processPayment(double amount) {
        paymentGateway.pay(amount);
    }
}

