class FeeCalculation {
    public static void main(String args[]) {

        // Declare and initialize the original fee amount
        int fee =  125000;

        // Declare and initialize the discount percentage
        double discountPercent =10;

        // Calculate the discount amount 
        double discount = (fee *discountPercent)/100;

        // Calculate the final fee after applying the discount
        double discountedFee = fee - discount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + discountedFee);
    }
}
