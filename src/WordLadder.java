import java.util.*;

public class WordLadder {
    public static int ladderLength(String start, String end, HashSet<String> dict) {
       if(start.length() != end.length()){
    	   return 0;
       }
       if(start.length() == 0 || end.length() == 0){
    	   return 1;
       }
       if(dict.size() == 0){
    	   return 0;
       }
       int minLen = 1;
       dict.remove(start);
       dict.add(end);
       Queue<String> q = (Queue<String>) new LinkedList<String> ();
       q.add(start);
       q.add(null);
       while(!q.isEmpty()){
    	   String cur = q.remove();
    	   if(cur == null && q.isEmpty()){
    		   return 0;
    	   }
    	   if(cur == null && !q.isEmpty()){
    		   minLen += 1;
    		   q.add(null);
    		   cur = q.remove();
    	   }
    	   if(cur.equals(end)){
    		   return minLen;
    	   }
    	   char[] curArr = cur.toCharArray();
    	   for(int i = 0; i < curArr.length; ++i){
    		   char c = curArr[i];
    		   for(char r = 'a'; r <= 'z'; ++r){
    			   if(r != c){
    				   curArr[i] = r;
    				   String modifiedStr = new String (curArr);
    				   if(dict.contains(modifiedStr)){
    					   q.add(modifiedStr);
    					   dict.remove(modifiedStr);
    				   }
    			   }
    		   }
    		   curArr[i] = c;
    	   }
       }
       return 0;
    }

    public static void main(String[] args){

    	HashSet<String> set = new HashSet<String>();
    	set.add("hot");
    	set.add("dog");
    	set.add("dot");
    	int r = ladderLength("hot", "dog", set);
    	System.out.print(r);
    }
}
