import java.util.*;
public class buy_sell_stock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int[] prices = new int[n];    
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                if(profit > maxprofit){
                    maxprofit = profit;
                }
            }
        }
        System.out.println(maxprofit);
    }
}