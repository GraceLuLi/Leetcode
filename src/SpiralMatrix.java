import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	if(matrix.length == 0 || matrix[0].length == 0){
    	    return result;
    	}
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int l = Math.min(m,n);
    	
    	for(int k = 0; k < l/2; ++k){
    		int start = k;
    		int end = l-1-k;
    		for(int i = start; i < end; ++i){
    			result.add(matrix[start][i]);
    		}
    		for(int j = start; j < end; ++j){
    			result.add(matrix[j][end]);
    		}
    		for(int i = end; i > start; --i){
    			result.add(matrix[end][i]);
    		}
    		for(int j = end; j > start; --j){
    			result.add(matrix[j][start]);
    		}
    	}
    	if(l%2 == 1){
    		if(m > l){
        		for(int i=l/2; i <= m/2; ++i){
        			result.add(matrix[i][l/2]);
        		}
    		}
            if(n > l){
        		for(int j=l/2; j <= n/2; ++j){
        			result.add(matrix[l/2][j]);
        		}
            }
            if(m == n){
                result.add(matrix[l/2][l/2]);
            }
    		
    	}
        return result;
    }
}