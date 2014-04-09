import java.util.*;

public class Combinations {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
    	ArrayList<ArrayList<Integer>> buffer = new ArrayList<ArrayList<Integer>>();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	buffer.add(new ArrayList<Integer>());
        combineHelper(1,n,k,buffer, result);
        return result;
    }
    
    public void combineHelper(int num,int n, int k, ArrayList<ArrayList<Integer>> buffer, ArrayList<ArrayList<Integer>> result){
    	
    	if(num > n){
    		return;
    	}
    	int size = buffer.size();
    	for(int i = 0; i < size; ++i){
    		ArrayList<Integer> base = buffer.get(i);
    		ArrayList<Integer> baseCopy = (ArrayList<Integer>)base.clone();
    		baseCopy.add(num);
    		if(baseCopy.size() == k){
    			result.add(baseCopy);
    		}
    		else{
    			buffer.add(baseCopy);
    		}
    	}
    	combineHelper(num+1, n, k, buffer, result);
    }
}