public class RemoveDuplicatesInSortedArray {
    public int removeDuplicates(int[] A) {
    	if(A.length == 0 || A.length == 1){
    		return A.length;
    	}
    	int pos = 1;
    	int iter = 1;
    	while(iter < A.length){
    		while(iter < A.length && A[iter] == A[iter-1]){
    			iter++;
    		}
    		if(iter < A.length){
    		    A[pos++] = A[iter++]; 
    		}
    	}
        return pos;
    }
}
