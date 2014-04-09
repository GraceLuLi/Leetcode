public class RemoveElement{
    public int removeElement(int[] A, int elem) {
    	int lastPos = A.length;
    	int i = 0;
    	while(i < lastPos){
    		if(A[i] == elem){
    		    lastPos--; 
    	        Swap(A,i, lastPos);
    		}
    		else{
    		    i++;
    		}
    	}
        return lastPos;
    }
    public static void Swap(int[] A, int i, int j){
    	int tmp = A[i];
    	A[i] = A[j];
    	A[j] = tmp;
    }
}
