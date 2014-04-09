import java.util.ArrayList;

public class SpiralMatrixII {
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
    		int rowEnd = m-1-k;
    		int colEnd = n-1-k;
    		for(int j = start; j < colEnd; ++j){
    			result.add(matrix[start][j]);
    		}
    		for(int i = start; i < rowEnd; ++i){
    			result.add(matrix[i][colEnd]);
    		}
    		for(int j = colEnd; j > start; --j){
    			result.add(matrix[rowEnd][j]);
    		}
    		for(int i = rowEnd; i > start; --i){
    			result.add(matrix[i][start]);
    		}
    	}
    	if(l%2 == 1){
    		if(m > l){
        		for(int i=l/2; i < (m-l/2); ++i){
        			result.add(matrix[i][l/2]);
        		}
    		}
            if(n > l){
        		for(int j=l/2; j < (n-l/2); ++j){
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