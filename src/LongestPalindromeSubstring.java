public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        
    }
    public void palindromeHelper(String s,int start, int end, String maxSubstring){
    	int mid = (start + end)/2;
    	for(int i = 1; i < mid-start; ++i){
    		if(s.charAt(mid-i) != s.charAt(mid+i)){
    			break;
    		}
    	}
    	if()
    }
}
