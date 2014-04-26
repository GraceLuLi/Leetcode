
public class SortColors {
    public void sortColors(int[] A) {
        int i = 0;//the start index of 
        int j = A.length-1;
        int k = 0;
        while(k < j+1){
        	if(A[k] == 0){
        		A[k] = A[i];
        		A[i] = 0;
        		++i;
        		++k;
        	}
        	else if(A[k] == 2){
        		A[k] = A[j];
        		A[j] = 2;
        		--j;
        	}
        	else{
        		++k;
        	}
        }   
    }
}
