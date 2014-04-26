
public class InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if(m + n != s3.length()){
        	return false;
        }
        if(m == 0){
        	return s2.equals(s3);
        }
        if(n == 0){
        	return s1.equals(s3);
        }
     // record[i][j] stores isInterleave(s1.substring(0,i), s2.substring(0,j) s3.substring(0, i+j))
        boolean[][] record = new boolean[m+1][n+1]; 
        record[0][0] = true;
        for(int i = 1; i < m+1; i++){
        	record[i][0] = (s1.substring(0,i)).equals(s3.substring(0,i));
        }
        for(int i = 1; i < n+1; i++){
        	record[0][i] = (s2.substring(0,i)).equals(s3.substring(0,i));
        }
        for(int i = 1; i < m+1; ++i){
        	for(int j = 1; j < n+1 ; ++j){
        		if(s1.charAt(i-1) == s3.charAt(i+j-1) && record[i-1][j]){
        		    record[i][j] = true;
        		}
        		else if(s2.charAt(j-1) == s3.charAt(i+j-1) && record[i][j-1]){
        			
        			record[i][j] = true;
        		}
        	}
        }
        return record[m][n];
    }
    public static void main(String[] args){
    	boolean b = isInterleave("aabd", "abdc","aabdabcd");
    	
    }
}
