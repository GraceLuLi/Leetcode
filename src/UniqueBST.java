public class UniqueBST {
    public int numTrees(int n) {
        return numTreesHelper(1, n);
    }
    public int numTreesHelper(int start, int end){
    	if(start > end){
    		return 0;
    	}
    	if(start == end){
    		return 1;
    	}
    	int tmp = 0;
    	tmp += 2*numTreesHelper(start+1, end);
        for(int i = start; i < end; ++i){
        	tmp +=  (numTreesHelper(start, i-1) * numTreesHelper(i+1, end));        	
        }
    	return tmp;
    }
}