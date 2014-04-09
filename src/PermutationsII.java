import java.util.*;

public class PermutationsII {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
    	boolean[] visited = new boolean[num.length];
    	Arrays.sort(num);
    	permuteUniqueHelper(num, visited, tmp, result);
        return result;
    }
    public void permuteUniqueHelper(int[] num, boolean[] visited,ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> result){
    	if(tmp.size() == num.length){
    		result.add(new ArrayList<Integer>(tmp));
    		return;
    	}
    	for(int i = 0; i < num.length; ++i){
           if(!visited[i]){
       		  if(i > 0 && visited[i-1] && num[i-1] == num[i]){
    			continue;   			
    		  }

    		 visited[i] = true;
    		 tmp.add(num[i]);
    		 permuteUniqueHelper(num, visited, tmp, result);
    		
    		 visited[i] = false;
    		 tmp.remove(tmp.size()-1);
           }
    	}
    }

}