import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < num.length; ++i){
    		int curr = num[i];
        	if(map.containsKey(curr)){
        		continue;
        	}
        	int pre = curr;
        	int post = curr;
        	int preCount = 0;
        	int postCount = 0;
        	if(map.containsKey(curr - 1)){
        		preCount = map.get(curr-1);
        		for(int j = preCount; j >0 ; j--){
        			--pre;
        		}	
        	}
        	if(map.containsKey(curr + 1)){
        		postCount = map.get(curr + 1);
        		for(int j=postCount; j > 0 ; j--){
        			++post;
        		}
        	}
        	map.put(pre, preCount+postCount+1);
            map.put(post, preCount+postCount+1);
            if(pre != curr && post != curr){
            	map.put(curr, 1);// curr in middle of sequence, just mark it exists, we won't check it again
            }
    	}
    	int longest = 1;
        for(int k : map.keySet()){
        	longest = Math.max(longest, map.get(k));
        }
        return longest;
    }
}
