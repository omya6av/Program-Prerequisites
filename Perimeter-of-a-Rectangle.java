import java.util.*; 

class Perimeter-of-a-Rectangle{
public static void main(String args[]) {

  Scanner o = new Scanner(System.in); 
  
  double len, wid, perimeter; 
  len = o.nextDouble(); 
  wid = o.nextDouble(); 
  perimeter = 2 * (len + wid); 
  
  System.out.println(perimeter); 

}
}