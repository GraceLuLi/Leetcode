public class MaximumSubArray {
    public int maxSubArray(int[] A) {
    	int max = A[0];
    	int[] record = new int[A.length];
    	record[0] = A[0];
        for(int i = 1; i < A.length; ++i){
        	int maxForCurr = Math.max(A[i], A[i]+record[i-1]);
        	record[i] = maxForCurr;
            if(max < maxForCurr){
            	max = maxForCurr;
            }
        }
        return max;
    }
}