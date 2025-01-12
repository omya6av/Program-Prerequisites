class PenDistrubution {
    public static void main(String args[]) {

        // Declare and initialize the total number of pens
        int pens = 14;

        // Calculate the number of pens each student gets when distributed equally among 3 students
        int distributedPens = pens/3;

        // Calculate the remaining pens that are not distributed
        int remainingPens = pens%3;

        // Display the number of pens per student and the remaining pens
        System.out.println("The Pen Per Student is " + distributedPens + " and the remaining pen not distributed is " + remainingPens);
    }
}
