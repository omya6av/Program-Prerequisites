class DemonstrateNullPointerException {

	// Method to generate the Exception
	public static void generateException() {
		// define the variable text and initialize it to null.
		String text = null;
		int textLength = text.length();

		System.out.println("Length of the text : " + textLength);

	}

	// Write the Method to demonstrate NullPointerException
	public static void demonstrateNullPointerException() {
		// define the variable text and initialize it to null.
		String text = null;

		try {
			int textLength = text.length();
			System.out.println("Length of the string : " + textLength);
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception caught: null object can not called.");
		}

	}

	public static void main(String args[]) {

		System.out.println("calling method to generate NullPointerException :");
		// call one of the String Method to generate the exception
		generateException();

		System.out.println("calling method to generate NullPointerException : ");
		// call the method to handle the RuntimeException
		demonstrateNullPointerException();
	}
}