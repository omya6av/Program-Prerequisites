class ProfitLoss {
    public static void main(String args[]) {
        // Declare and initialize the cost price
        double costPrice = 129;

        // Declare and initialize the selling price
        double sellingPrice = 191;

        // Calculate profit as the difference between selling price and cost price
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage using the formula: (profit / costPrice) * 100
        double profitPercentage = (profit / costPrice) * 100;

        // Print the cost price, selling price, profit, and profit percentage
        System.out.println("The Cost Price is INR " + costPrice  + " and Selling Price is INR " + sellingPrice + ". The Profit is INR " + profit 
                           + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
