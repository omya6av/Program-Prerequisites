import java.util.Scanner;

 class FindStringLength {

    // Method to find the length of a string without using length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access each character
                count++; // Increment the counter
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When out of bounds, return the count
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input as a line of text
        System.out.print("Enter a text line: ");
        String userInput = input.nextLine();

        // Find length using the custom method
        int customLength = findLength(userInput);

        // Find length using the built-in length() method
        int builtInLength = userInput.length();

        // Display results
        System.out.println("Length of the text line using custom method: " + customLength);
        System.out.println("Length of the text line using built-in method: " + builtInLength);

        input.close();
    }
}
