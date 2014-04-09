import java.util.ArrayList;
import java.util.Arrays;

public class SubSetsII {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	result.add(0,new ArrayList<Integer>());

    	Arrays.sort(num);
    	for(int i = 0; i < num.length ; ++i){
    		int number = num[i];
    		subsetsHelper(number, result);
    	}
        return result;
    }
    public void subsetsHelper(int currNum, ArrayList<ArrayList<Integer>> result){
    	int size = result.size();   	
    	for(int i = 0; i < size; ++i){
    		
    		ArrayList<Integer> preSet = result.get(i);
    		ArrayList<Integer> currSet = (ArrayList<Integer>) preSet.clone();
    		currSet.add(currNum);
    		boolean duplicate = false;
    		for(ArrayList<Integer> oldset : result){
    			if(currSet.equals(oldset)){
    				duplicate = true;
    				break;
    			}
    		}
    		if(!duplicate){
        	    result.add(currSet); 
    		}  		
    	}
    }
}