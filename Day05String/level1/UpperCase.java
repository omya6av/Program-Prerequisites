import java.util.Scanner;

class UpperCase {

    public static String upperCase(String text) {

        String tempText = "";

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                tempText += (char)(text.charAt(i) - 32);
            } else {
                tempText += text.charAt(i);
            }
        }
        return tempText;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a string : ");
        String text = input.nextLine();

        String builtIn = text.toUpperCase();
        String userDefined = upperCase(text);

        // print the result
        System.out.println("Result from both methods is : " + (builtIn.equals(userDefined)));

        System.out.println("Result from user defined method is : " + userDefined);
        System.out.println("Result from built in  method is : " + builtIn);

        input.close();
    }
}