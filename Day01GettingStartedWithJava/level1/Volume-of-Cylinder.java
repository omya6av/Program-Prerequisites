import java.util.*; 

class Volume-of-Cylinder{
public static void main(String args[]) {

  Scanner o = new Scanner(System.in); 
  
  double radius, height, volume; 
  radius = o.nextDouble(); 
  height = o.nextDouble(); 
  
  volume = (3.141 * radius^2 * height ); 
  
  System.out.println(volume); 

}
}