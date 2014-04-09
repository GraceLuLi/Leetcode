import java.util.*;

public class Candy {
    public int candy(int[] ratings) {
    	int sum = 0;
    	int len = ratings.length;
    	int[] leftCandies = new int[len];
    	int[] rightCandies = new int[len];
    	leftCandies[0] = 1;
    	rightCandies[len-1] = 1;
    	for(int i = 1; i < len; ++i){
    		if(ratings[i] > ratings[i-1]){
    			leftCandies[i] = leftCandies[i-1] + 1;
    		}
    		else{
    			leftCandies[i] = 1;
    		}
    	}
    	for(int i = len-2; i >= 0; --i){
    		if(ratings[i] > ratings[i+1]){
    			rightCandies[i] = rightCandies[i+1] + 1;
    		}
    		else{
    			rightCandies[i] = 1;
    		}
    	}
    	for(int i = 0; i < len; ++i){
    		sum += Math.max(leftCandies[i], rightCandies[i]);
    	}
    	return sum;
    }
}