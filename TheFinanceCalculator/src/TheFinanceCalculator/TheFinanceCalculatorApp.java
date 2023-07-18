package TheFinanceCalculator;

public class TheFinanceCalculatorApp {
	public static void main(String [] args) {
		TheFinanceCalculator calculator = new TheFinanceCalculator();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));
}
}