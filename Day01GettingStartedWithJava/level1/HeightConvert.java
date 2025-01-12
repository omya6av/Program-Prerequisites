import java.util.Scanner;

class HeightConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Decalre and initialize height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double height = input.nextDouble(); 

        // Convert height from cm to inches
        double totalInches = height / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double remainingInches = totalInches % 12; 

        // Print the height in cm, feet, and inches
        System.out.println("Your Height in cm is " + height 
                           + " while in feet is " + feet 
                           + " and inches is " + remainingInches));
						   

        // Close the Scanner
        input.close();
    }
}
   
	   
	   
	   
	 