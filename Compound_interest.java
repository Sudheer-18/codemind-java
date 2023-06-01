import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principle = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();

        double totalAmount = calculateCompoundInterest(principle, rate, time);
        System.out.printf("%.2f", totalAmount);

        scanner.close();
    }

    public static double calculateCompoundInterest(double principle, double rate, double time) {
        double amount = principle * Math.pow((1 + rate / 100), time);
        return amount;
    }
}
