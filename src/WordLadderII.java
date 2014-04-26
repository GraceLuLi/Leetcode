import java.util.*;

public class WordLadderII {
	public static class wordNode{
		String name;
		ArrayList<String> path;
		wordNode(String n, ArrayList<String> p){
			name = n;
			path = p;
		}
	}
    public static ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        
        if(start.length() != end.length()){
        	return result;
        }
        if(start.length() == 0 || end.length() == 0){
           list.add("");
           list.add("");
           result.add(list);
     	   return result;
        }
        if(dict.size() == 0){
     	   return result;
        }
        dict.remove(start);
        dict.add(end);
        
        Queue<wordNode> q = new LinkedList<wordNode>();
        ArrayList<String> tmpPath = new ArrayList<String>();
        tmpPath.add(start);
        q.add(new wordNode(start, tmpPath));
        q.add(null);
        
        while(!q.isEmpty()){
     	   wordNode cur = q.remove();
     	   if(cur == null && q.isEmpty()){
     		   return result;
     	   }
     	   if(cur == null && !q.isEmpty()){
     		   q.add(null);
     		   cur = q.remove();
     	   }

     	   if((cur.name).equals(end)){
     		   if(!result.isEmpty()){
     			   if(result.get(0).size() == (cur.path).size()){
     				  result.add(new ArrayList<String>(cur.path));
     			   }
     			   else if(result.get(0).size() > (cur.path).size()){
     				   result = new ArrayList<ArrayList<String>>();
     				   result.add(new ArrayList<String>(cur.path));
     			   }
     		   }
     		   else{
     		       result.add(new ArrayList<String>(cur.path));
     		   }
     	   }
     	   if(!dict.isEmpty()){// if dict is empty, not need to add new node
     		  char[] curArr = (cur.name).toCharArray();
        	   for(int i = 0; i < curArr.length; ++i){
        		   char c = curArr[i];
        		   for(char r = 'a'; r <= 'z'; ++r){
        			   if(r != c){
        				   curArr[i] = r;
        				   String modifiedStr = new String (curArr);
        				   if(dict.contains(modifiedStr)){
        					   tmpPath = new ArrayList<String>(cur.path);
        					   tmpPath.add(modifiedStr);
        					   q.add(new wordNode(modifiedStr,tmpPath));
        					   dict.remove(modifiedStr);
        				   }
        			   }
        		   }
        		   curArr[i] = c;
        	   }
     	   }
     	   
        }
        return result;
     }
    
     public static void main(String[] args){
    	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
     	HashSet<String> set = new HashSet<String>();
     	set.add("a");
     	set.add("b");
     	set.add("c");
     	result= findLadders("a", "c", set);
     	for(ArrayList<String> list : result){
     		System.out.print("[");
     		for(String str : list){
     			System.out.print(str + ", ");
     		}
     		System.out.print("]");
     		System.out.println();
     	}
     }
}
