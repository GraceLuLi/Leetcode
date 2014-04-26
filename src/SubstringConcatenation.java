import java.util.ArrayList;
import java.util.HashMap;

public class SubstringConcatenation {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int m = S.length();
        int n = L[0].length();
    	int l = L.length;
    	
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	for(String str : L){
    		if(!map.containsKey(str)){
    			map.put(str, 1);
    		}else{
    			map.put(str, map.get(str) + 1);
    		}
    	}
    	
    	for(int i = 0; i <= m-n*l; ++i){
    		String s2 = S.substring(i, n*l+i);
    		HashMap<String, Integer> map2 = (HashMap<String, Integer>) map.clone();
    		while(true){
    			String word = s2.substring(0, n);
    			if(map2.containsKey(word)){
    				int num = map2.get(word);
    				if(num == 0){
    					break;
    				}
    				map2.put(word, num-1);
    				s2 = s2.substring(n);
    				if(s2.length() == 0){
        				result.add(i);
        				break;
        			}
    			}
    			else{
    				break;
    			}
    		}
    	}
        return result;
    }
}
