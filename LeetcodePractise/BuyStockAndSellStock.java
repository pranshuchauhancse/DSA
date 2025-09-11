// Leetcode Problem Number : 121

package LeetcodePractise;   // Make sure folder structure matches (else remove this line)

// Import statements must come here, not inside the class
import java.util.*;

public class BuyStockAndSellStock {

    // Function to calculate maximum profit
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // track minimum price seen so far
        int maxProfit = 0;                 // track maximum profit

        for (int price : prices) {
            // Update minimum price if current price is lower
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit if selling today and update maxProfit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit; // return maximum profit found
    }

    // Main method to test
    public static void main(String[] args) {
        BuyStockAndSellStock obj = new BuyStockAndSellStock();
        
        int[] prices = {7,1,5,3,6,4};
        int result = obj.maxProfit(prices);
        
        System.out.println("Maximum Profit: " + result);
    }
}
