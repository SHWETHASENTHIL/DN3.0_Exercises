package ImplementingtheAdapterPattern;

public class GatewayAdapter implements PaymentProcessor { // Renamed class to follow convention
    private Gateway gateway; // Renamed field for consistency

    public GatewayAdapter(Gateway gateway) { // Fixed parameter name
        this.gateway = gateway; // Fixed naming consistency
    }

    @Override
    public void processPayment(double amount) {
        gateway.chargeCard(amount);
    }
}

