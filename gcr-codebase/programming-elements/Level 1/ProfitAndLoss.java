//Create ProfitAndLoss class to calculate profit and profit percentage

public class ProfitAndLoss {

    public static void main(String[]args) {
        //Create variables costPrice and sellingPrice to store costPrice and sellingPrice
        double costPrice = 129, sellingPrice = 191;

        //Create a variable profit to store the profit 
        double profit = sellingPrice - costPrice;

        //Create a variable profitPercentage to hold the profitPercentage
        double profitPercentage = profit / costPrice * 100;

        //Print the Profit and Profitpercentage along with the cost price and selling Price
        System.out.println("The Cost Price is INR " + costPrice+
                           " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
                           );
    }
}