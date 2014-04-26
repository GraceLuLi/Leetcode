public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        if(prices == null || prices.length == 0){// important
        	return maxP;
        }
        int[] left = new int[prices.length];  // left[i] stores max profit from [0, i]
        int[] right = new int[prices.length]; // right[i] stores max profit from [i, length-1]
        process(prices, left, right);
        for(int i = 0; i < prices.length; ++i){
        	maxP = Math.max(maxP, left[i] + right[i]);
        }
        return maxP;
    }
    public void process(int[] prices, int[] left, int[] right){
        int maxProfit = 0;
    	//deal with the left 
    	left[0] = 0;
    	int min = prices[0]; // min price to buy stock
    	for(int i = 1; i < prices.length; ++i){
    		left[i] = Math.max(left[i], prices[i] - min);
    		min = Math.min(min, prices[i]); // update the min on the left
    	}
    	//deal with the right
    	right[prices.length-1] = 0;
    	int max = prices[prices.length-1]; // max price to sell stock
    	for(int i = prices.length-2; i >= 0; --i){
    		right[i] = Math.max(right[i+1], max - prices[i]);
    		max = Math.max(max, prices[i]);
    	}
    }
}