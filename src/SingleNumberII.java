public class SingleNumberII {
    public int singleNumber(int[] A) {
        int r = 0;
        for(int i = 0; i < 32; ++i){
        	int c = 0;
        	for(int j = 0; j < A.length; ++j){	
        		if(((A[j]>>i) & 1) == 1) {
        			c = (c+1)%3;
        		}
        	}

    		r |= (c<<i);
    	
        }
        return r;
    }
    public static void main(String[] args){
    	int r = -5;
    	for(int i = 0; i < 32; ++i){
    		int d = 1<<i;
    		int c = (r&d)>0? 1:0;
    		System.out.print(c);
    	}
		System.out.print("h");
    }
}
