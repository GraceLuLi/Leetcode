//Your algorithm's runtime complexity must be in the order of O(log n)

public class SearchForARange {
    public int[] searchRange(int[] A, int target) {
        int start = 0;
        int end = A.length-1;
        while(start < A.length && end >= 0 && start <= end){//!!! not start < end 
        	int mid = (start + end)/2;
        	if(A[mid] == target){
        		int i = mid;
        		int j = mid;
        		while(i-1 >= 0 && A[i-1] == target){
        			--i;
        		}
        		while(j+1 < A.length && A[j+1] == target){
        			++j;
        		}
        		return new int[]{i,j};
        	}
        	else if(A[mid] < target){
        		while(mid+1 < A.length && A[mid+1] == A[mid]){
        			++mid;
        		}
        		start = mid+1;
        		
        	}
        	else{
        		while(mid-1 >= 0 && A[mid] == A[mid-1]){
        			--mid;
        		}
        		end = mid-1;
        	}
        }
        return new int[]{-1,-1};
    }
}
