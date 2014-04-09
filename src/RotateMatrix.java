public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
    	for(int k = 0; k < n/2; ++k ){
			int start = k;
			int end = n-1-k;
    		for(int i = start; i < end; ++i){
    			int dist = i - start;
    			//tmp = top
    			int tmp = matrix[start][i];
    			// top = left
    			matrix[start][i] = matrix[end-dist][start];
    			// left = bottom
    			matrix[end-dist][start] = matrix[end][end-dist];
    			//bottom = right
    			matrix[end][end - dist] = matrix[i][end];
    			//right = top
    			matrix[i][end] = tmp;    			
    		}
    	}
    }
}