
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] A) {
        if(A == null || A.length == 0){
            return 1;
        }
        int i = 0;
        while(i < A.length){
        	if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length){
        		i++;
        		continue;
        	}
        	// swap val so that A[val-1] == val; 
        	int val = A[i];
        	int tmp = A[val-1];
        	A[val-1] = val;
        	A[i] = tmp; 	
        }
        for(int j = 0; j < A.length; ++j){
        	if(A[j] != j+1){
        		return j+1;
        	}
        }
        return A.length+1;
    }
    public static void main(String[] args){
    	int[] A = new int[]{3,4,-1,1};
    	int a = firstMissingPositive(A);
    	System.out.print(a);
    }
}
