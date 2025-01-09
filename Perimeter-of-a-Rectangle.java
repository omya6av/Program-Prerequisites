import java.util.*; 

class Perimeter-of-a-Rectangle{
public static void main(String args[]) {

  Scanner o = new Scanner(System.in); 
  
  double length, width, perimeter; 
  length = o.nextDouble(); 
  width = o.nextDouble(); 
  perimeter = 2 * (length  + width); 
  
  System.out.println("Perimeter-of-a-Rectangle = " + perimeter); 

}
}