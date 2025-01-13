import java.util.*;

class SumOfAllNumbers {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double[] elements = new double[10];

        // initializes total and index
        double total = 0.0;
        int index =0;

        System.out.println("Enter the Numbers : ");
        while(true){

            // enter the Numbers
            double temp = input.nextDouble();

            if( index == 10 || temp <= 0 ){
                break;
            }
            
            elements[index++] = temp;
        }

        // Sum of all elements in total
        for(int i=0; i<index; i++){
            total += elements[i];
        }

        // print the result
        System.out.println("The total value is : "+ total);

        input.close();
    }
}