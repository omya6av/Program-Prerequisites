import java.util.*;

class MultiplicationTable6To9 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
 
        // take input from user
        int number = input.nextInt();
        
        // take a table for multiplication result
        int multiplicationResult[] = new int[4];
        
        
        for (int i =0; i < 4; i++) {
            multiplicationResult[i] = number * (i+6);
        }
         
        // print the table 
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i+6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}