public class JumpGame {
    public boolean canJump(int[] A) {
    	int farestReach = 0;
    	for(int i = 0; i < A.length; ++i){

            if(farestReach >= A.length-1){
            	return true;
            }
    		if(farestReach == i && A[i] == 0){
    			return false;
    		}
    		if(A[i] + i > farestReach){
    			farestReach = A[i] + i;
    		}    		
    	}
    	return false;
         
    }
}