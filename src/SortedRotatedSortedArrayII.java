import java.util.*;

public class SortedRotatedSortedArrayII {
    public boolean search(int[] A, int target) {
       return searchHelper(A, target, 0, A.length-1);
    }
    public boolean searchHelper(int[] A, int target, int start, int end){
    	if(start > end){
    		return false;
    	}
    	int mid = (start + end)/2;
    	if(A[mid] == target){
    		return true;
    	}
    	if(A[mid] > A[start]){
    		if(A[start] <= target && target < A[mid]){
    			return searchHelper(A, target, start, mid-1);
    		}
    		else{
    			return searchHelper(A, target, mid + 1, end);
    		}
    	}
    	else if(A[mid] < A[start]){
    		if(A[mid] < target && target <= A[end]){
    			return searchHelper(A, target, mid + 1, end);
    		}
    		else{
    			return searchHelper(A, target, start, mid-1);
    		}
    	}
    	else{// A[mid] == A[start] 
    		if(A[mid] != A[end]){// all the left are repeat
    			return searchHelper(A, target, mid + 1, end);
    		}
    		else{
    			return searchHelper(A, target, start, mid-1) || searchHelper(A, target, mid + 1, end);
    		}
    	}
    }
}