import java.util.Scanner;

public class AthleteRounds {

    public static void main(String[] args) {
        // Create a new Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the lengths of the sides of the triangle
        System.out.print("Enter the length of the first side of the triangle in meters: ");
        double side1 = input.nextDouble();  

        System.out.print("Enter the length of the second side of the triangle in meters: ");
        double side2 = input.nextDouble(); 

        System.out.print("Enter the length of the third side of the triangle in meters: ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds to complete 5 km (5000 meters)
        double rounds = 5000 / perimeter;

        // Display the number of rounds the athlete must run to complete 5 km
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
    }
}
