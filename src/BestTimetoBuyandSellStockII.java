public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
    	if(prices.length == 0 || prices.length == 1){
    		return 0;
    	}
    	int sum = 0;
    	for(int i = 1; i < prices.length; ++i){
    		if(prices[i-1] < prices[i]){
    			sum += (prices[i] - prices[i-1]);
    		}
    	}
        return sum;
    }
}

/**  Method2
public int maxProfit(int[] prices) {
int sum = 0;
int min = Integer.MAX_VALUE;
for(int i = 0; i < prices.length; ++i){
	if(prices[i] <= min){
		min = prices[i];
	}
	else{
		int a = prices[i] - min;
		sum += a;
		min = prices[i];
	}
}
return sum;
}
*/