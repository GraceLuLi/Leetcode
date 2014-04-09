public class NQueensII {
    public int totalNQueens(int n) {
        int[] cols = new int[n];
        return totalNQueensHelper(0, n, cols);
    }
    public int totalNQueensHelper(int index, int n, int[] cols){
        if(index == n){
            return 1;
        }
        int total = 0;
        for(int val = 0; val < n; ++val){
            if(checkValid(index, val, cols)){
                int[] colsClone = new int[n];
                colsClone = cols.clone();
                colsClone[index] = val;
                total += totalNQueensHelper(index+1, n, colsClone);
            }
        }
        return total;
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