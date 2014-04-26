import java.util.Arrays;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {

        int max = 0;
        int[] dp = new int[s.length()];
        Arrays.fill(dp, 0);
        for(int i = s.length()-2; i >= 0; --i){
        	if(s.charAt(i) == '('){
        		int j = i+1 + dp[i+1];
        		if(j < s.length() && s.charAt(j) == ')'){
        			dp[i] = dp[i+1]+2;
            		if(j+1 < s.length()){
            			dp[i] += dp[j+1];
            		}
        		}
        		max = Math.max(max, dp[i]);
        	}
        }
        return max;
    }
    public static void main(String[] args){
    	int a = longestValidParentheses("(()");
    	System.out.print(a);
    }
}
