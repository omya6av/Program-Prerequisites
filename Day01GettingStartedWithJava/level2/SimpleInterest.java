import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        // Create a new Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();  

        //enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        //Enter the time period
        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble(); 
        // Calculate the Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + " years.");
    }
}
