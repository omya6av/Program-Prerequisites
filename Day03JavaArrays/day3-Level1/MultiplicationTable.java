import java.util.*;

class MultiplicationTable {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
 
        // enter the number 
        int number = input.nextInt();
        
        // take a table array
        int[] table = new int[10];
        
        
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }
         
        // print the table 
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}