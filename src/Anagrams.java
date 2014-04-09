import java.util.*;

public class Anagrams {
    public static ArrayList<String> anagrams(String[] strs) {
    	ArrayList<String> result = new ArrayList<String>();
    	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    	for(int i = 0; i < strs.length; ++i){
    		String curr = strs[i];
    		char[] currArr = curr.toCharArray();
    		Arrays.sort(currArr);
    		curr = new String(currArr);
    		if(!map.containsKey(curr)){
        		ArrayList<String> list = new ArrayList<String>();
    			map.put(curr, list);
    		}
    		map.get(curr).add(strs[i]);
    	}
    	ArrayList<String> tmp;
    	for(String k : map.keySet()){
    		tmp = map.get(k);
    		if(tmp.size() > 1){
    			result.addAll(tmp);
    		}
    	}
        return result;
    }
    
    public static void main(String[] args){
    	
    	String[] input = {"ant", "ant"};
    	ArrayList<String> output = anagrams(input);
    	System.out.println(input.length);
    	System.out.println(output.size());
    	for(String s: output){
    		System.out.print(s);
    		System.out.print("a");
    	}

    }
}