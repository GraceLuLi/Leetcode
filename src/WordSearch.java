
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0){
        	return true;
        }
        int m = board.length;
        int n = (m == 0? 0:board[0].length);
        boolean[][] visited = new boolean[m][n];
        char first = word.charAt(0);
        for(int i = 0; i < m; ++i){
        	for(int j = 0; j < n; ++j){
        		if(board[i][j] == first){
        			visited[i][j] = true;
        			if(searchRest(board, visited, i, j , word.substring(1))){
        				return true;
        			}
        			visited[i][j] = false;
        		}
        	}
        }
        return false;
    }
    public boolean searchRest(char[][] board, boolean[][] visited,int i, int j, String word){
        if(word.length() == 0){
        	return true;
        }
        int m = board.length;
        int n = (m == 0? 0:board[0].length);
    	char c = word.charAt(0);
    	boolean r = false;
    	if(i+1 < m && board[i+1][j] == c && !visited[i+1][j]){
    		visited[i+1][j] = true;
    		r = searchRest(board,visited, i+1, j, word.substring(1));
    		if(r == true) return true;
    		visited[i+1][j] = false;
    	}
    	if(j+1 < n && board[i][j+1] == c && !visited[i][j+1]){
    		visited[i][j+1] = true;
    		r = searchRest(board,visited, i, j+1, word.substring(1));
    		if(r == true) return true;
    		visited[i][j+1] = false;
    	}
    	if(i-1 >= 0 && board[i-1][j] == c && !visited[i-1][j]){
    		visited[i-1][j] = true;
    		r = searchRest(board, visited, i-1, j, word.substring(1));
    		if(r == true) return true;
    		visited[i-1][j] = false;
    	}
    	if(j-1 >= 0 && board[i][j-1] == c && !visited[i][j-1]){
    		visited[i][j-1] = true;
    		r = searchRest(board, visited, i, j-1, word.substring(1));
    		if(r == true) return true;
    		visited[i][j-1] = false;
    	}
    	return r;
    }
}
