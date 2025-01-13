import java.util.Scanner;

class TravelComputation {
   public static void main(String[] args) {
       //Create scanner object
       Scanner input = new Scanner(System.in);

       //Create variables and take user inputs for name, fromCity, viaCity, toCity
       System.out.println("Enter name of traveller :");
       String name = input.nextLine();
       System.out.println("Enter name of boarding city :");
       String fromCity = input.nextLine();
       System.out.println("Enter name of via city :");
       String viaCity = input.nextLine();
       System.out.println("Enter name of final city :");
       String toCity = input.nextLine();

       //Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
       System.out.println("Enter distance from starting city to via city in miles :");
       double fromToVia = input.nextDouble();
       System.out.println("Enter distance from via city to final city in miles :");
       double viaToFinal = input.nextDouble();

       // Calculate total ditance from Start city to final city
       double totalDistance = fromToVia + viaToFinal;

       //Create variables and take user input for time taken between cities
       System.out.println("Enter time taken minutes from starting city to via city in minutes");
       double timeFromToVia = input.nextDouble();
       System.out.println("Enter time taken minutes from via city to final city in minutes ");
       double timeViaToFinal = input.nextDouble();

       // Calculate total time taken from Start city to final city
      double totalTime = timeFromToVia + timeViaToFinal ;

       // Print the travel details
       System.out.println("The Total Distance travelled by " + name + " from " +
               fromCity + " to " + toCity + " via " + viaCity +
               " is " + totalDistance + " miles and " +
               "the Total Time taken is " + totalTime + " minutes");
   }
}