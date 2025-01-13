import java.util.*;

class TwoDArrayInto1DArray {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // take input from user
        int rows = input.nextInt();
        int columns = input.nextInt();

        // 2D Array 
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }


        //1D Array
        int[] resultArray = new int[rows * columns];

        //define the index variable 
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int  j= 0; j < columns; j++) {
                resultArray[index++] = matrix[i][j];
            }
        }


        // printing the resultArray 
        for (int i = 0; i < resultArray.length; i++) {
         System.out.println( resultArray[i] );
        }


        input.close();
    }
}