import java.util.Scanner;

class FindFactorArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the Number : ");    
        int number= input.nextInt();
         
		int maxIndex =10; 
        int[] maxFactor  = new int[10];

        // store the factors in maxFactor array
		int index=0;
        for (int i = 1; i <= number; i++) {
			
			if(maxIndex == index){
			// create a temporary array
			 int temporary[] = new int[maxIndex*2]; 
			 
			 //copy the max factor array in temporary
			 for(int j=0; j<maxIndex; j++){
			     temporary[j] = maxFactor[j]; 
			 }
			 maxFactor = temporary; 
			}		
			
			if (number % i == 0) {
              maxFactor[index++]=i;
            } 
        }

        //Printing factor array
        System.out.println("All Factors of "+number +" is :");
        for (int i = 0; i < index ; i++) {
            System.out.println(maxFactor[i]);
        }
		
        input.close();
    }
}