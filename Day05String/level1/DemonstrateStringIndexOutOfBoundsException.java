import java.util.*; 

class DemonstrateStringIndexOutOfBoundsException {

	// Method to generate the Exception
	public static void generateException(String text) {
		
		int textLength = text.length();
		System.out.println(text.charAt(text.length()+1));

	}

	// Write the Method to demonstrate ArrayIndexOutOfBoundsException
	public static void demonstrateArrayIndexOutOfBound(String text) {

		try {
			int textLength = text.length();
			System.out.println("print the one char from string : " + textLength);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: null object can not called.");
		}

	}

	public static void main(String args[]) {
      Scanner input = new Scanner(System.in); 
	  
	  System.out.println("Enter a String : ");
	  String text = input.nextLine(); 
	  
	  System.out.println("Firstly call the method to generate the Exception"); 
	  generateException(text); 
	  
	  System.out.println("call the method to handle the RuntimeException");  
	  demonstrateArrayIndexOutOfBound(text); 

	}
}