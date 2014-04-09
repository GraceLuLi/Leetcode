public class RemoveDuplicatesfromSortedArrayII {
	public static int removeDuplicates(int[] A){
	    if(A.length == 0){
	        return 0;
	    }
	    int i = 1;
	    int count = 1;
	    int[] record = new int[A.length];
	    record[0] = A[0];
	    int index = 1;
	    while(i < A.length){
	        if(A[i] == A[i-1]){
	            int curr = A[i];
	            record[index++] = A[i++];
	            while(i < A.length && A[i] == curr){
	                i++;
	            }
	            count++;
	        }
	        else{
	        	record[index++] = A[i++];
	            count++;
	        }    
	    }
        for(int k = 0; k < count; ++k){
        	A[k] = record[k];
        }
        
	    return count;
	}
public static void printArray(int[] A){
	for(int a : A){
		System.out.print(a + " ");
	}
}
public static void main(String[] args){
	int[] A =  {1,1,1,2};
	int num = removeDuplicates(A);
	System.out.println(num);
	printArray(A);
}
	
}