public class SudokuSolver {
    public void solveSudoku(char[][] board) {
    	solveSudokuHelper(board); 	
    }
    public boolean solveSudokuHelper(char[][] board){
    	for(int i = 0; i < 9; ++i){
    		for(int j = 0; j < 9; ++j){
    			if(board[i][j] == '.'){
    				for(int d = 1; d <= 9; ++d){
    					board[i][j] = (char)(d+'0');
    					if(isValid(board, i, j) && solveSudokuHelper(board)){
    						return true;
    					}
    					board[i][j] = '.';
    				}
    				return false;
    			}
    		}
    	}
       return true;
    }
    public boolean isValid(char[][] board, int row, int col){
    	for(int i = 0; i < 9 ; ++i){
    		if(i != row && board[i][col] == board[row][col]){
    			return false;
    		}
    	}
    	for(int j = 0; j < 9; ++j){
    		if(j != col && board[row][j] == board[row][col]){
    			return false;
    		}
    	}
    	for(int i = 3*(row/3); i < 3*(row/3+1); ++i){
    		for(int j = 3*(col/3); j < 3*(col/3+1); ++j){
    			if((i != row || j != col) && board[i][j] == board[row][col]){
    				return false;
    			}
    		}
    	}
    	return true;
    }
}