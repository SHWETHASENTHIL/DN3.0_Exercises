package FinancialForecasting;
public class FinancialForecastingTool {

    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        // Base case: No periods left, return initial value
        if (periods == 0) {
            return initialValue;
        }
        // Recursive case: Compute future value for one less period
        return calculateFutureValue(initialValue, growthRate, periods - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double growthRate = 0.05;     // 5% growth rate
        int periods = 10;             // Number of periods

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}

