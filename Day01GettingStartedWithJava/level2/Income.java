import java.util.Scanner;

public class Income {
   public static void main(String[] args) {

       // Create a scanner object
       Scanner input= new Scanner(System.in);

       //Create variable to store salary and bonus
       double salary , bonus;
       // Take input from user
       System.out.print("Enter the salary : ");
        salary = input.nextDouble();

       System.out.print("Enter the bonus : ");
        bonus = input.nextDouble();

       // Calculate the total income by adding salary and bonus
       double totalIncome = salary + bonus;

       // Print the result
       System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
      
       input.close();
   }
}