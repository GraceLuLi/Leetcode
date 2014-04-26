import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(num == null || num.length < 4){
    		return result;
    	}
    	Arrays.sort(num);
    	ArrayList<Integer> tmpList;
    	int i = 0;
    	while(i < num.length-3){
    		int j = i + 1;
    		while(j < num.length-2){
    			int start = j+1;
    			int end = num.length-1;
    			while(start < num.length && end >= 0 && start < end){
    				int sum = num[i] + num[j] + num[start] + num[end];
    				if(sum == target){
    		    		tmpList = new ArrayList<Integer>();
    		    		tmpList.add(num[i]);
    	    			tmpList.add(num[j]);
    	    			tmpList.add(num[start]);
    	    			tmpList.add(num[end]);
    	    			result.add(tmpList);
    	    			do{
    						++start;
    					}while(start < num.length && num[start] == num[start-1]);
    	    			do{
    						--end;
    					}while(end >= 0 && num[end] == num[end+1]);
    				}
    				else if(sum < target){
    					do{
    						++start;
    					}while(start < num.length && num[start] == num[start-1]);
    				}
    				else{//sum > target
    					do{
    						--end;
    					}while(end >= 0 && num[end] == num[end+1]);
    				}
    			}
				do{
					++j;
				}while(j < num.length-2 && num[j] == num[j-1]);
    		}
    		do{
				++i;
			}while(i < num.length-3 && num[i] == num[i-1]);
    	}
    	return result;
    }
}
