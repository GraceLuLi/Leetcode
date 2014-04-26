import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(num == null || num.length == 0){
    		return res;
    	}
    	Arrays.sort(num);
    	int i = 0;
    	ArrayList<Integer> tmpList;
    	while(i < num.length-2){
    		int n1 = num[i];
    		int start = i+1;
    		int end = num.length-1;
    		while(start < num.length && end >= 0 && start < end){
    			if(num[start] + num[end] + n1 == 0){
    				tmpList = new ArrayList<Integer>();
    				tmpList.add(n1);
    				tmpList.add(num[start]);
    				tmpList.add(num[end]);
    			    res.add(tmpList);
    				do{
    				   ++start;
    				}while(start < num.length && num[start] == num[start-1]);
    				do{
    					--end;
    				}while(end >= 0 && num[end] == num[end+1]);
    			}
    			else if(num[start] + num[end] + n1 < 0){
    				do{
     				   ++start;
     				}while(start < num.length && num[start] == num[start-1]);
    			}
    			else{
    				do{
    					--end;
    				}while(end >= 0 && num[end] == num[end+1]);
    			}
    		}
    		do{
    			++i;
    		}while(i < num.length && num[i] == num[i-1]);
    	}
    	return res;
    }
}