public class BuySellStock {

	    public int maxProfit(int[] prices) {
	       
	    	if(prices.length == 0 || prices.length == 1){
	    		return 0;
	    	}
	    	return maxProfitHelper(prices, 0, prices.length-1);
	    	
	    }
	    
	    public int maxProfitHelper(int[] prices, int start, int end){
	    	if(start >= end){
	    	    return 0;
	    	}
	        if(end - start == 1){
	    		int profit = prices[end] - prices[start];
	    		return Math.max(0, profit);
	    	}
	    	int profit = 0;
	    	int mid = (start + end)/2;
	    	int min = Integer.MAX_VALUE;
	    	for(int i = start; i < mid; ++i){
	    		if(prices[i] < min){
	    			min = prices[i];
	    		}
	    	}
	    	int max = Integer.MIN_VALUE;
	    	for(int i = mid; i <= end; ++i){
	    		if(prices[i] > max){
	    			max = prices[i];
	    		}
	    	}
	    	if(max - min > profit){
	    		profit = max - min;
	    	}
	    	int leftP = maxProfitHelper(prices, start, mid-1);
	    	int rightP = maxProfitHelper(prices, mid, end);
	    	profit = Math.max(profit, leftP);
	    	profit = Math.max(profit, rightP);
	    	return profit;
	    	
	    }
	   		
	   
	
}
