
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int A[], int B[]) {
    	
    	double[] C = new double[A.length+B.length];
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	while(i < A.length && j < B.length){
    		if(A[i] < B[j]){
    			C[k++] = A[i++];
    		}
    		else{
    			C[k++] = B[j++];
    		}
    	}
    	while(i < A.length){
    		C[k++] = A[i++];
    	}
    	while(j < B.length){
    		C[k++] = B[j++];
    	}
    	k--;
    	if((k+1)%2 == 0){
    		return (C[k/2] + C[k/2 +1])/2;
    	}
        return C[k/2];
    }
}
