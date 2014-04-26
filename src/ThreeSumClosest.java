import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
    	if(num == null || num.length < 3){
    		return 0;
    	}
    	int res = num[0]+num[1] + num[2];
    	Arrays.sort(num);
    	int i = 0;
    	while(i < num.length-2){
    		if(res == target){
    			break;
    		}
    		int n1 = num[i];
    		int start = i+1;
    		int end = num.length-1;
    		while(start < num.length && end >= 0 && start < end){
    			int sum = num[start] + num[end] + n1;
    			if(Math.abs(sum - target) < Math.abs(res - target)){
    				res = sum;
    			}
    			if(sum == target){
                   break;
    			}
    			else if(sum < target){
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