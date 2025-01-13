import java.util.Scanner;

class SideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
       // Input the Perimeter of square 
	   double perimeter = input.nextDouble();
	   
	   // calculate the side 
	   double side = perimeter/4; 
	   
	   // print the result
	   System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter); 
  
  
  
  }
 }
  