import java.util.Arrays;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
    	
    	int[][] records = new int[grid.length][grid[0].length];
    	for(int i = 0; i < grid.length; ++i){
    		Arrays.fill(records[i], -1);
    	}
    	records[0][0] = grid[0][0];
    	minPathSum(grid, grid.length-1, grid[0].length-1, records);
    	
        return records[records.length-1][records[0].length -1];
    }
    
    public void minPathSum(int[][] grid, int row, int col, int[][] records){
   	
    	if(row == 0 && col == 0){
    		return;
    	}
    	int min = Integer.MAX_VALUE;
    	if(row-1 >= 0){
        	if(records[row-1][col] == -1){
        		minPathSum(grid, row-1, col, records);
        	}
        	min = Math.min(min, records[row-1][col]);
    	}
    	if(col-1 >= 0){
        	if(records[row][col-1] == -1){
        		minPathSum(grid, row, col-1, records);
        	}
        	min = Math.min(min, records[row][col-1]);
    	}
    	records[row][col] = grid[row][col] + min;
    	
    }
}