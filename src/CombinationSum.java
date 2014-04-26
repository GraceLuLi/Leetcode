import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(candidates == null || candidates.length == 0){
    		return res;
    	}
    	Arrays.sort(candidates);
    	ArrayList<Integer> tmpList = new ArrayList<Integer>();
    	combinationSum(candidates,target, tmpList, res);
    	return res;
    }
    public void combinationSum(int[] candidates, int target, ArrayList<Integer> tmpList, ArrayList<ArrayList<Integer>> result){
    	for(int i = 0; i < candidates.length; ++i){
    		
    		int curr = candidates[i];
    		if(curr > target){
    			return;
    		}
    		if(tmpList.size() != 0 && tmpList.get(tmpList.size()-1) > curr){
    			continue;
    		}
			tmpList.add(curr);
    		if(curr == target){
    			result.add(new ArrayList<Integer>(tmpList));
    		}
    		else{
        		combinationSum(candidates, target-curr, tmpList, result);
    		}
            tmpList.remove(tmpList.size()-1);	
    	}
    }
}
