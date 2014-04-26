import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
    	int maxRect = 0;
    	int m = matrix.length;
    	int n = (m == 0 ? 0:matrix[0].length); 
    	int[][] heights = new int[m][n+1];
        for(int i = 0; i < m; ++i){
        	// create a new rectangle histogram for current row
        	for(int j = 0; j < n; ++j){
        		if(matrix[i][j] == '0'){
        			heights[i][j] = 0;
        		}
        		else{
        			heights[i][j] = (i == 0? 1:heights[i-1][j]+1);
        		}
        	}
            
        }
        for(int i = 0; i < m; ++i){
        	int tmp = maxHistogram(heights[i]);
        	maxRect = Math.max(maxRect, tmp);
        }
        return maxRect;
    }
    public int maxHistogram(int[] arr){
    	int maxRect = 0;
    	Stack<Integer> s = new Stack<Integer>();
    	int k = 0;
    	while(k < arr.length){
    		if(s.isEmpty() || arr[s.peek()] <= arr[k]){
    			s.push(k);
    			k++;
    		}
    		else{// s.peek() >= curr
    			int index = s.pop();
    			maxRect = Math.max(maxRect, arr[index]*(s.isEmpty()? k:(k-1 - s.peek())));
    		}
    	}
    	return maxRect;
    }
}
