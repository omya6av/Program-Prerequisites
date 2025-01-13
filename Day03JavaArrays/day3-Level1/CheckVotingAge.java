import java.util.*;

class CheckVotingAge {
      public static void main(String args[]) {

            Scanner input = new Scanner(System.in);

            int[] studentAge = new int[10];

            // Enter the Age of students
            for (int i = 0; i < studentAge.length; i++) {
                  studentAge[i] = input.nextInt();
            }

            // check the age is valid for voiting or not
            for (int i = 0; i < studentAge.length; i++) {
                  if (studentAge[i] < 0) {
                        System.out.println("An invalid age");
                  } else if (studentAge[i] >= 18) {
                        System.out.println("The student with the age " + studentAge[i] + " can vote.");
                  } else {
                        System.out.println("The student with the age " + studentAge[i] + " cannot vote.");
                  }
            }

            input.close();
      }
}