import java.util.Scanner;

public class FeeCalculatorWithInput {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the fee
        System.out.print("Enter the course fee: ");
        int fee = scanner.nextInt();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        int discountPercent = scanner.nextInt();

        // Calculate the discount amount
        int discount = (fee * discountPercent) / 100;

        // Calculate the final fee after discount
        int finalFee = fee - discount;

        // Print the discount amount and final fee
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
