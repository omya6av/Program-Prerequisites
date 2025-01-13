//Create a program to take a number as input and reverse the number. 
import java.util.Scanner;

class ReverseTheNumber {
   public static void main(String[] args) {

       // Create a scanner object
       Scanner input = new Scanner(System.in);

      System.out.print("Enter Number : ");
      int number = input.nextInt();

      //Create array to store digits
       int[] digit = new int [10];
     
       //Take input from user 
        int temp;   
        int count =0;
		
    while(number!=0){
        temp = number % 10;
        digit[count] = temp;
        number = number / 10;
        count++;
        }
     
     
         // Print the array in reverse order
           System.out.print("Reversed Number is : ");
         for(int j = 0; j<count ;j++) {
            System.out.print(digit[j]);
         }
        
        
       input.close();

   }
}