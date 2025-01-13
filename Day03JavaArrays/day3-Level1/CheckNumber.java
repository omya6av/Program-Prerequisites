import java.util.*;

class CheckNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[5];

        //   Enter the numbers
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

//check the numbers that it is even, odd, positive, negative and zero 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The Number " + numbers[i] + " is even and Positive");
                } else {
                    System.out.println("The Number " + numbers[i] + " is odd and Positive");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The Number " + numbers[i] + " is negative");
            } else {
                System.out.println("The number is Zero");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First number and last number are equal " + numbers[0]);
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("Number at index 0: " + numbers[0] + " is greater than last index number : " + numbers[numbers.length - 1]);
        } else {
            System.out.println("First Number : " + numbers[0] + " is less than last number : " + numbers[numbers.length - 1]);
        }


        input.close();
    }
}