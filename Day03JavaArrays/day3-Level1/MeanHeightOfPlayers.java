import java.util.*;

class MeanHeightOfPlayers  {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
		// create an array of height of football players
        double[] heightsOfSize11 = new double[11];

       // Take the input 
       for(int i=0; i<11; i++){
	        heightsOfSize11[i] = input.nextDouble(); 
	    }
		
		double sumOfElements = 0.0; 
	   
	   // Sum of all football players height
	   for(int i=0; i<11; i++){
	     sumOfElements +=  heightsOfSize11[i]; 
	   }
	   
	   double meanHeight = sumOfElements/ 11; 
	   
	   // print the result
        System.out.println(" The mean height of the football team : " + meanHeight); 
		
		
        input.close();
    }
}