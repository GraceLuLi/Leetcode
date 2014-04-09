public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        boolean[] checker = new boolean[9];
        for(int i = 0; i < 9; ++i){
            checker = new boolean[9]; 
            for(int j=0; j < 9; ++j){
            	  char c = board[i][j];
                if((int)c == 46){
                    continue;
                }
                if(c < '1' || c > '9' || checker[c-'1'] == true){
                    return false;
                }
                checker[c-'1'] = true;
            }
        }   
        for(int j=0; j < 9; ++j){
            checker = new boolean[9]; 
            for(int i = 0; i < 9; ++i){
                char c = board[i][j];
                if((int)c == 46){
                    continue;
                }
                if(c < '1' || c > '9' || checker[c-'1'] == true){
                    return false;
                }
                checker[c-'1'] = true;
            }
        }
        int m = 0;
       while(m <= 6){
          int n = 0;
          while(n <= 6){
           checker = new boolean[9]; 
           for(int i=m; i <m+3; ++i){
             for(int j=n; j <n+3; ++j){
                char c = board[i][j];
                if((int)c == 46){
                    continue;
                }
                if(c < '1' || c > '9' || checker[c-'1'] == true){
                    return false;
                }
                checker[c-'1'] = true;
             }
            }
          n += 3;
        }
        m += 3;
       }
       return true;
    }
}

