
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        int divisor = 1;
        for(int i = 0; i < n; ++i){
        	arr[i] = i+1;
        	divisor *= (i+1);
        }
        // change K from (1,n) to (0, n-1) to accord to index!!
        --k;
        String res = "";
        int index = n;
        int digitIndex;
        while(index > 0){
        	divisor /= index;
        	digitIndex = k/divisor;
        	k = k%divisor;
        	res += arr[digitIndex];
        	for(int j = digitIndex; j < n-1; ++j){
        		arr[j] = arr[j+1];
        	}
        	--index;	
        }
        return res;
    }
}
