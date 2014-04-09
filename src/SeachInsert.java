public class SeachInsert {
    public int searchInsert(int[] A, int target) {
        return searchInsertHelper(A, target, 0, A.length-1);
    	
    }
    public int searchInsertHelper(int[] A, int target, int start, int end){
    	
    	if(start > end){
    		return  start;
    	}
    	
    	int mid = (start + end)/2;
    	if(A[mid] == target){
    		return mid;
    	}
    	else if(A[mid] > target){
    		return searchInsertHelper(A, target, start, mid-1);
    	}
    	else{
    		return searchInsertHelper(A, target, mid+1, end); 
    	}
    		
    }
}