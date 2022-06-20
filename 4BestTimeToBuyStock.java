import java.util.*;
class Solution {
    //given an array prices, where prices[i] is the price of the stock on ith day 
    //choose a single day to buy one stock and choose a different day to sell that stock

    //[7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        //return the maximum profit you can achieve from this transaction
        // if you cannot achieve any profit return zero 
        // using two pointers 
        int ptr1 = 0;
        int ptr2 = 1;
        int maxProfit = 0;
        while (ptr2 < prices.length){
            int diff = prices[ptr2]-prices[ptr1];
            if (diff > maxProfit){
                maxProfit = diff;
            }
            //the only time ptr1 needs to move is when ptr2's value is less than it
            if (prices[ptr2] < prices[ptr1]){
                ptr1 = ptr2;

            }         
            ptr2++;
        }

        return maxProfit;
        


        
    }
}