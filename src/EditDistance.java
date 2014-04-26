import java.util.*;
public class EditDistance {
    public int minDistance(String word1, String word2) {
    	int len1 = (word1 == null? 0:word1.length());
    	int len2 = (word2 == null? 0:word2.length());
    	// dp[i][j] stores minDistance from word1.substring(0,i) to word2.substring(0,j)
        int[][] dp = new int[len1+1][len2+1];
        for(int i = 0; i <= len1; ++i){
        	dp[i][0] = i;
        }
        for(int i = 0; i <= len2; ++i){
        	dp[0][i] = i;
        }
        for(int i = 1; i <= len1; ++i){
        	for(int j = 1; j <= len2; ++j){
        		if(word1.charAt(i-1) == word2.charAt(j-1)){
        			dp[i][j] = dp[i-1][j-1];
        		}
        		else{
        			int tmp = Math.min(dp[i-1][j-1], dp[i-1][j]);
        			tmp = Math.min(tmp, dp[i][j-1]);
        			dp[i][j] = tmp+1;
        		}
        		
        	}
        }
        return dp[len1][len2];
    }
}
