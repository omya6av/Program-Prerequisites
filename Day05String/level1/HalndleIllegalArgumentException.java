import java.util.Scanner;

public class HalndleIllegalArgumentException {

    // Method to generate the IllegalArgumentException
    public static void generateException(String text) {
        // This line will throw IllegalArgumentException if start index > end index
        System.out.println("Attempting to extract substring with invalid indices...");
        String result = text.substring(5, 3); // Start index > end index
        System.out.println("Substring: " + result); // This line will not execute
    }

    // Method to handle the IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println("Handling exception using substring with invalid indices...");
            String result = text.substring(5, 3); // Start index > end index
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Illegal argument for substring method. " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call the method to generate the exception
        System.out.println("\nCalling method to generate exception...");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("\nCalling method to handle exception...");
        handleException(text);

        input.close();
    }
}
