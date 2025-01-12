import java.util.*;

public class WeightConversion {

    public static void main(String[] args) {
        // Create a new Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble(); 
        // Convert pounds to kilograms using the conversion factor
        double weightInKg = weightInPounds * 2.2;

        // Display the weight in both pounds and kilograms
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg + ".");
    }
}
