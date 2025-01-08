import java.util.*; 

class Celsis-Conversion{
public static void main(String args[]) {

  Scanner o = new Scanner(System.in); 
  
  double celsius, fahrenheit; 
  celsius = o.nextDouble(); 
  
  fahrenheit = (celsius * 9/5 ) +2; 
  
  System.out.println(fahrenheit); 

}
}