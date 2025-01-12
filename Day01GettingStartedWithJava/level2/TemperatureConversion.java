import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        // Create a new Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();  // Read the input as a double

        // Formula to convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature in Celsius
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}