public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
    	
    	int size = m + n - 1;
    	int i = m - 1;
    	int j = n - 1;
    	
    	while(i >= 0 && j >= 0){
    		if(A[i] > B[j]){
    			A[size--] = A[i--];
    		}
    		else{
    			A[size--] = B[j--];
    		}
    	}
    	while(j >= 0){
    		A[size--] = B[j--];
    	}        
    }
}