package ImplementingtheAdapterPattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of the payment gateways
        Paymentgateway paymentGateway = new Paymentgateway();
        Gateway gateway = new Gateway();
        
        // Create adapters for the payment gateways
        PaymentProcessor payAdapter = new Pay(paymentGateway);
        PaymentProcessor gatewayAdapter = new GatewayAdapter(gateway);
        
        // Use the adapters to process payments
        payAdapter.processPayment(100.00);
        gatewayAdapter.processPayment(150.00);
    }
}


