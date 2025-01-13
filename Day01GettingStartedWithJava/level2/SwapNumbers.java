import java.util.Scanner;

class SwapNumbers {
   public static void main(String[] args) {

       // Create a scanner object
       Scanner input = new Scanner(System.in);

       //Create variables to store two numbers
       int number1 , number2 ;
       // Take input from user
       System.out.print("Enter the first number: ");
        number1 = input.nextInt();

       System.out.print("Enter the second number: ");
        number2 = input.nextInt();

       // Swap the numbers using a temporary variable
       int temp = number1;
       number1 = number2;
       number2 = temp;

       System.out.println("The swapped numbers are "+number1 +" and "+number2);
       scanner.close();
   }
}