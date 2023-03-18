import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int profit=0;
        int min=prices.get(0),max=prices.get(0);
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)>max){
                max=prices.get(i);
            }
            if(prices.get(i)<min){
                min=prices.get(i);
                max=prices.get(i);
            }
            profit=Math.max(profit, max-min);
        }
        return profit;
    }
}