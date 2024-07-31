package FinancialForecasting;
public class FinancialForecastingToolIterative  {

    public static double calculateFutureValueIterative(double initialValue, double growthRate, int periods) {
        double futureValue = initialValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double growthRate = 0.05;     // 5% growth rate
        int periods = 10;             // Number of periods

        double futureValue = calculateFutureValueIterative(initialValue, growthRate, periods);
        System.out.println("Future Value (Iterative): " + futureValue);
    }
}
