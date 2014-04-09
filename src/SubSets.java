import java.util.*;

public class SubSets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	result.add(0,new ArrayList<Integer>());
    	Arrays.sort(S);
    	for(int i = 0; i < S.length ; ++i){
    		int num = S[i];
    		subsetsHelper(num, result);
    	}
        return result;
    }
    public void subsetsHelper(int currNum, ArrayList<ArrayList<Integer>> result){
    	int size = result.size();   	
    	for(int i = 0; i < size; ++i){
    		ArrayList<Integer> preSet = result.get(i);
    		ArrayList<Integer> currSet = (ArrayList<Integer>) preSet.clone();
    		currSet.add(currNum);
    	    result.add(currSet);   		
    	}
    }
}