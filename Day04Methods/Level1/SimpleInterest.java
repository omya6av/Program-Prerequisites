import java.util.Scanner;

class SimpleInterest {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100; // Formula for simple interest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for Principal amount
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        // Taking user input for Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        // Taking user input for Time in years
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculating and displaying the Simple Interest
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate %.2f%%, and Time %.2f years.%n", interest, principal, rate, time);

        sc.close(); // Closing scanner to prevent resource leaks
    }
}
