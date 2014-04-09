import java.util.Arrays;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        int[][] checker = new int[m+1][n+1];
        for(int i = 0; i < checker.length; ++i){
        	Arrays.fill(checker[i], -1);
        }
        for(int i = 0; i < m+1; ++i){
        	checker[i][0] = 0;
        	checker[i][1] = 1;
        }
        for(int j = 0; j < n+1; ++j){
        	checker[0][j] = 0;
        	checker[1][j] = 1;
        }
        
    	uniquePaths(m,n, checker);
    	return checker[m][n];
    }
    
    public void uniquePaths(int m, int n, int[][] checker){

    	if(checker[m][n] != -1){
    		return;
    	}
    	uniquePaths(m-1, n, checker);
    	uniquePaths(m, n-1, checker);
    	checker[m][n] = checker[m-1][n] + checker[m][n-1];
    	if(n < checker.length && m < checker[0].length){
    		checker[n][m] = checker[m][n];
    	}
    }
}