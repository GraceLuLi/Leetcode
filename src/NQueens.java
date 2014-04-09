import java.util.ArrayList;

public class NQueens {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> result = new ArrayList<String[]>();
        int[] cols = new int[n];
        solveNQueensHelper(0,cols, n, result);
        return result;
    }
    public void solveNQueensHelper(int index, int[] cols, int n, ArrayList<String[]> result){
        if(index == n){
            String[] board = new String[n];
            for(int i = 0; i < n; ++i){
                int col = cols[i];
                String a = "";
                for(int j = 0; j < col; ++j){
                    a += ".";
                }
                a += "Q";
                for(int j = col+1; j < n; ++j){
                    a += ".";
                }
                board[i] = a;
            }
            result.add(board);
            return;
        }
        for(int val = 0; val < n; ++val){
            if(checkValid(index, val, cols)){
                int[] colsClone = new int[cols.length];
                colsClone = cols.clone();
                colsClone[index] = val;
                solveNQueensHelper(index+1, colsClone, n, result);
            }
        }
    }

    public boolean checkValid(int index, int val, int[] cols){
        for(int i = 0; i < index; ++i){
            if(val == cols[i]){
                return false;
            }
            else if(Math.abs(index - i) == Math.abs(val - cols[i])){
                return false;
            }
        }
        return true;
    }  
}