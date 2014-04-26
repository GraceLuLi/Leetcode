import java.util.ArrayList;
import java.util.Arrays;

public class PalindromePartitionsII {
    public int minCut(String s) {
    	int len = s.length();
    	int[] Mins = new int[len+1];// Mins[i] stored minCuts for [i, len-1]
    	for(int i = 0; i <= len; ++i){
    		Mins[i] = len - i;
    	}
    	boolean[][] checker = new boolean[len][len]; // checker[i][j] check if a s.substring(i,j+1) is palindrome or not
        for(int i = len-1; i >= 0; --i){
        	for(int j = i; j < len; ++j){
        		if(s.charAt(i) == s.charAt(j) && (j-i <=1 || checker[i+1][j-1])){
        			checker[i][j] = true;
        			Mins[i] = Math.min(Mins[i], 1 + Mins[j+1]);
        		}
        	}
        }
        return Mins[0]-1;
    }

}
