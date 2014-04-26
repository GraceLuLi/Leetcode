public class LongestPalindromeSubstring {
    public static String longestPalindrome(String s) {
    	if(s == null){
    		return null;
    	}
    	if(s.length() < 2){
    		return s;
    	}
    	int len = s.length();
        boolean[][] record = new boolean[len][len];
        for(int i = len-1; i >= 0; --i){
        	for(int j = i; j < len; ++j){
        		if(s.charAt(i) == s.charAt(j) &&(j-i < 2 || record[i+1][j-1])){
        			record[i][j] = true;
        		}
        	}
        }
        for(int k = len-1; k >= 0; --k){
        	for(int i = 0; i < len-k; ++i){
        		int j = i + k;
        			if(record[i][j] == true){
        				return s.substring(i, j+1);
        			}
        		
        	}
        }
        return "";
    }
   public static void main(String[] args){
	   String a = longestPalindrome("bb");
	   System.out.print(a);
   }
}
