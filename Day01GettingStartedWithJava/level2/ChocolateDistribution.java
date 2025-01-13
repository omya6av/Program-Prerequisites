import java.util.*;

public class ChocolateDistribution {

    public static void main(String[] args) {
        // Create a new Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //  enter the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt(); 

        // enter the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt(); 

        // Calculate how many chocolates each child gets and how many are remaining
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;  // Divide chocolates equally
        int remainingChocolates = numberOfChocolates % numberOfChildren;  // Calculate remaining chocolates

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates + ".");
    }
}
