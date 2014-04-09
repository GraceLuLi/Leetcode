import java.util.Arrays;

public class DecodeWays {
    public int numDecodings(String s) {

        int len = s.length();
        if(len == 0){
            return 0;
        }
        int[][] checker = new int[len][len];
        for(int i = 0; i < len; ++i){
            Arrays.fill(checker[i], 0);
        }
        for(int i = 0; i < len; ++i){
            if(isValidCode(s, i, i)){
                checker[i][i] = 1;
            }
        }
        for(int k = 1; k < len; ++k){
            for(int i = k ; i < len; ++i){
                int j = i-k;
                
                checker[i][j] = checker[i-1][j] + checker[i][j+1];
                if(isValidCode(s,j,i)){
                    checker[i][j] += 1;
                }
            }
        }
        return checker[0][len-1];
    }
    public boolean isValidCode(String s, int start, int end){
        String subS = s.substring(start, end+1);
        if(subS.length() == 0 ||subS.length() > 2|| subS.charAt(0) == '0'){
            return false;
        }
        int a = Integer.parseInt(subS);
        if(a >= 1 && a <= 26){
            return true;
        }
        return false;       
    }
}