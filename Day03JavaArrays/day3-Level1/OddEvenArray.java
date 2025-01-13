import java.util.Scanner;

class OddEvenArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input from the user
        System.out.println("Enter the Number");
        int number = input.nextInt();

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];


        //Create index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Store odd number in odd array and even number in even array
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        //Printing even array
        System.out.println("Even array :");

        for (int i = 0; i < evenIndex; i++)
            System.out.println(even[i]);

        //Printing odd array
        System.out.println("Odd array :");

        for (int i = 0; i < oddIndex; i++)
            System.out.println(odd[i]);


        input.close();
    }
}