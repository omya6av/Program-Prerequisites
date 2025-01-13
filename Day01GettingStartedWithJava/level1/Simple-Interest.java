import java.util.*; 

class Simple-Interest{
public static void main(String args[]) {

  Scanner o = new Scanner(System.in); 
  
  double principle, rate, time, simpleInterest; 
  principle = o.nextDouble(); 
  rate = o.nextDouble(); 
  time = o.nextDouble(); 
  simpleInterest = (principle * rate * time ) / 100; 
  
  System.out.println(simpleInterest); 

}
}