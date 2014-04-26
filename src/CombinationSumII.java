import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(candidates == null || candidates.length == 0){
    		return res;
    	}
    	Arrays.sort(candidates);
    	ArrayList<Integer> tmpList = new ArrayList<Integer>();
    	combinationSum(candidates, 0, target, tmpList, res);
    	return res;
    }
    public void combinationSum(int[] candidates, int index, int target, ArrayList<Integer> tmpList, ArrayList<ArrayList<Integer>> result){
    	int i = index;
    	while(i < candidates.length){
    		int curr = candidates[i];
    		if(curr > target){
    			return;
    		}
			tmpList.add(curr);
    		if(curr == target){
    			result.add(new ArrayList<Integer>(tmpList));
    		}
    		else{
        		combinationSum(candidates, i+1, target-curr, tmpList, result);
    		}
            tmpList.remove(tmpList.size()-1);
            do{
            	++i;
            }while(i < candidates.length && candidates[i] == candidates[i-1]);
    	}
    }

}
