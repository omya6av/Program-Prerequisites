import java.util.*; 

class  Calculate-Average-of-Three-Numbers {
public static void main(String args[]) {

  Scanner o = new Scanner(System.in); 
  
  double one, two, three, avg; 
  one = o.nextDouble(); 
    two = o.nextDouble(); 
  three = o.nextDouble(); 
  avg = (one+two+three)/3 ; 
  
  System.out.println(avg); 

}
}