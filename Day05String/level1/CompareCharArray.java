import java.util.Scanner;

 class CompareCharArray {

    
    public static char[] charArray(String text) {
         
		 char [] result = new char[text.length()];
        
        
		// Iterate through each character in the string
		 for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
            }
			
			return result;
      
    }
    
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        
        //take input from user
       
	   System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		char[] resultFromUserDefined = charArray(text);
		char[] resultFromBuiltin =  text.toCharArray();
        
        // print the result
	   System.out.println("Result from user defined method is : ");
        for (int i = 0; i < resultFromUserDefined.length-1; i++) {
            System.out.print(resultFromUserDefined[i]+" , ");
        }
        System.out.println(resultFromUserDefined[resultFromUserDefined.length-1]);


        System.out.println("Result from built in  method is : ");
        for (int i = 0; i < resultFromBuiltin.length-1; i++) {
            System.out.print(resultFromBuiltin[i]+" , ");
        }
        System.out.print(resultFromBuiltin[resultFromBuiltin.length-1]);
		
        
        
        input.close();
    }
}