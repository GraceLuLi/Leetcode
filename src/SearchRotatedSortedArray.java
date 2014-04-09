public class SearchRotatedSortedArray {
	public static int search(int[] A, int target){
        int start = 0;
        int end = A.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target == A[mid]) return mid;
            if(A[mid] > A[start]){
                if(target >= A[start] && target < A[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            else if(A[mid] < A[start]) {
                if(target <= A[end] && target > A[mid]){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
            else{ //A[mid] == A[start] which means the mid index is same as the start index
            	
            		start = mid+1; // search right half
            	
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
    	int[] A = new int[]{3,1};
    	int result = search(A, 1);
    	System.out.print(result);
    }
}