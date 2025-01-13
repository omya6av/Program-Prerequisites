import java.util.*;

class FindYoungestTallestPerson  {
    public static void main(String args[]) {

     Scanner input = new Scanner(System.in);
 
     // take input from user

      int[] age = new int[3];  
      double height[] = new double[3];
	  
	  System.out.println("The three friend in the sequence of Amar, Akbar, Anthony :");
	  String name[] = {"Amar", "Akbar", "Anthony"}; 
	  
	  System.out.print("Enter the age :"); 
	  for(int i=0; i<3; i++){
	     age[i] = input.nextInt();
	  }
	  
	  System.out.print("Enter the height :"); 
	   for(int i=0; i<3; i++){
	     height[i] = input.nextDouble();
	  }
	  
	  int youngestAge = Integer.MAX_VALUE; 
	  int youngestName=0;
	  int tallest  = Integer.MIN_VALUE; 
	  int tallestName = 0; 
	  
	  // Find the youngest and tallest person
	  for(int i=0; i<3; i++){  
		if(youngestAge > age[i]){
		   youngestName= i; 
		
		}
		if(tallest < height[i]){
		   tallestName = i; 
		}
        }	

        // print the result 
       System.out.println( "The youngest of the 3 friends is "+ name[youngestName] +" and the tallest of the 3 friends is "+ name[tallestName]  );

       
        input.close();
    }
}