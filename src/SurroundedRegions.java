import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    public void solve(char[][] board) {
    	int m = board.length;
    	int n = m == 0? 0 : board[0].length;
        char[][] record = new char[m][n];
        
        // Use BFS
        Queue<Point> q = new LinkedList<Point>(); 
        for(int j = 0; j < n; ++j){
        	if(board[0][j] == 'O'){
        		q.add(new Point(0,j));
        	}
        	if(board[m-1][j] == 'O'){
        		q.add(new Point(m-1,j));
        	}
        }
        for(int i = 1; i < m-1; ++i){
        	if(board[i][0] == 'O'){
        		q.add(new Point(i, 0));
        	}
        	if(board[i][n-1] == 'O'){
        		q.add(new Point(i, n-1));
        	}
        }
        while(!q.isEmpty()){
        	Point cur = q.remove();
        	int x = cur.x;
        	int y = cur.y;
        	board[x][y] = 'Y';
        	if( x + 1 < m && board[x+1][y] == 'O'){
        		q.add(new Point(x+1, y));
        	}
        	if( x - 1 >= 0 && board[x-1][y] == 'O'){
        		q.add(new Point(x-1, y));
        	}
        	if( y + 1 < n && board[x][y+1] == 'O'){
        		q.add(new Point(x, y+1));
        	}
        	if( y - 1 >= 0 && board[x][y-1] == 'O'){
        		q.add(new Point(x, y-1));
        	}
        }
        for(int i = 0; i < m; ++i){
        	for(int j = 0; j < n; ++j){
        		if(board[i][j] == 'O'){
        			board[i][j] = 'X';
        		}
        	}
        }
        for(int i = 0; i < m; ++i){
        	for(int j = 0; j < n; ++j){
        		if(board[i][j] == 'Y'){
        			board[i][j] = 'O';
        		}
        	}
        }  
    }
}
