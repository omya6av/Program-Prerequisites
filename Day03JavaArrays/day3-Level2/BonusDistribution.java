// Create a program to find the bonus of 10 employees based on their years of service// an array
import java.util.Scanner;

class BonusDistribution {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

    
      // Define a double array to save salary and years of service
      double[] salary = new double[10];
	  double[] yearOfService = new double[10]; 
      double[] newSalary = new double[10];
      double[] bonus = new double[10];
	  
	  double totalBonus = 0; 
	  double totalOldSalary =0; 
	  double totalNewSalary =0; 
	  
       int index =0; 
        while(index != 10){
		
		System.out.println(" Enter the marks of Salary and year of Service "); 
		     index++; 
		     double tempSalary = input.nextDouble(); 
			 // If salary or year of service is an invalid number then ask the user to enter again
			  if( tempSalary < 0 ) {
			 System.out.println("Enter again the valid salary :");
			 index--; 
			 continue; 
			 }
			 
		     double tempService = input.nextDouble(); 	 
			 if( tempService < 0 ) {
			 System.out.println("Enter again the valid Year of service :");
			 index--; 
			 continue; 
			 }
			 
          salary[index-1] = tempSalary; 
		  yearOfService[index-1] = tempService; 
           totalOldSalary += salary[index-1]; 
       }
	   
	   //calculate the bonus of 10 employees  based on their years of service. 
	   for(int i=0; i<10; i++){
	       int tempBonus = 0; 
		   if(yearOfService[i] >= 5){
		      tempBonus += salary[i]*0.05; 
		   }else{
		       tempBonus += salary[i]*0.02; 
		   }
		   
		   //Save the bonus in the array
		   bonus[i] = tempBonus; 
		   //compute the new salary,
		   newSalary[i] = bonus[i]+salary[i]; 
		   
		   totalBonus += bonus[i]; 
		   totalNewSalary += newSalary[i] 

		   }
	   
	 //Print the total bonus payout as well as the total old and new salary of all the employees
	   System.out.println("the total bonus payout : "+ totalBonus + ",  the total old salary : "+ totalOldSalary +", the total new salary of all the employees is : "+ totalNewSalary );
		
      // Close the Scanner Object
      input.close();
   }
}