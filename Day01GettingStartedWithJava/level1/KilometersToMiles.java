import java.util.*; 

class KilometersToMiles {
    public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in); 
	
        //declare and initialize kilometers
        int kilometers = input.nextInt();

        // Calculate the kilometers to miles 
		double miles = kilometers*1.6; 
		
        // Display the results
        System.out.println("The total miles is "+ miles +" mile for the given " + kilometers  + " km");
    }
}
