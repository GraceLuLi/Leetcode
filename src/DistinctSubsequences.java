
public class DistinctSubsequences {
	//method1. too slow, can't pass in big data
   /* public int numDistinct(String S, String T) {
        if(S == null || S.length() == 0 || T == null || T.length() == 0){
        	return 0;
        }
        int num = 0;
        char t = T.charAt(0);
        for(int i = 0; i < S.length(); ++i){
        	if(t == S.charAt(i)){
        		num += numDistinct(S.substring(i), T.substring(1));
        	}
        }
        return num;
    }*/
	// Method2, Dynamic programming
	public int numDistinct(String S, String T){
        if(S == null || T == null || S.length() < T.length()){
        	return 0;
        }
		// record[i][j] stored the distinct subsequences of T.substring(0,i) in S.substring(0,j)
		int[][] record = new int[T.length()+1][S.length()+1]; 
		//record[0][0] = 1;
		for(int i = 0; i < T.length()+1; ++i){
			record[i][0] = 0;
		}
		for(int i = 0; i < S.length(); ++i){
			record[0][i] = 1;
		}
		for(int i = 1; i <= T.length(); ++i){
			for(int j = 1; j <= S.length(); ++j){
				record[i][j] = record[i][j-1];
				if(T.charAt(i-1) == S.charAt(j-1)){// be careful!
					record[i][j] += record[i-1][j-1];
				}
			}
		}
		return record[T.length()][S.length()];
	}
}