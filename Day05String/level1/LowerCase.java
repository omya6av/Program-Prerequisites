import java.util.Scanner;

class LowerCase {

    public static String lowerCase(String text) {

        String s2 = "";

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {

            if (Character.isUpperCase(text.charAt(i))) {
                s2 += (char) (text.charAt(i) + 32);
            } else {
                s2 += text.charAt(i);
            }
        }
        return s2;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input from user

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String builtIn = text.toLowerCase();
        String userDefined = lowerCase(text);

        // print the result
        System.out.println("Result from both methods is : " + (builtIn.equals(userDefined)));

        System.out.println("Result from user defined method is : " + userDefined);
        System.out.println("Result from built in  method is : " + builtIn);

        input.close();
    }
}