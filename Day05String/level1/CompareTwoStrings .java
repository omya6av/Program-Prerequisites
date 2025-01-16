import java.util.*;

class CompareTwoStrings {

	public static boolean isStringEqual(String text1, String text2) {
		boolean a = true;
		if (text1.length() != text2.length()) {
			a = false;
		} else {
			for (int i = 0; i < text1.length(); i++) {
				if (text1.charAt(i) != text2.charAt(i)) {
					a = false;
					break;
				}
			}
		}
		return a;
	}

	public static void main(String args[]) {

		// Create a scanner object
		Scanner input = new Scanner(System.in);

		// Take user input
		System.out.print("Enter String 1: ");
		String text1 = input.nextLine();

		System.out.print("Enter String 2: ");
		String text2 = input.nextLine();

		boolean resultFromMethod = isStringEqual(text1, text2);

		boolean resultFromBuiltIn = text1.equals(text2);

		// Print the results

		// print the result
		System.out.println("Result from both methods is : " + (resultFromMethod == resultFromBuiltIn));

		System.out.println("Result from user defined method is : " + resultFromMethod);
		System.out.println("Result from built in  method is : " + resultFromBuiltIn);

		input.close();

	}
}