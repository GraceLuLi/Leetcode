import java.util.*;

public class Permutations {
	/*
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<ArrayList<Integer>> previous = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
    	previous.add(tmp);
    	if(num.length == 0){
    		return result;
    	}
    	permuteHelper(num, 0, previous, result);
        return result;    
    }
    public void permuteHelper(int[] num, int index, ArrayList<ArrayList<Integer>> previous, ArrayList<ArrayList<Integer>> result){
        if(index >= num.length){
        	for(ArrayList<Integer> each : previous){
        		result.add(each);
        	}
        	return;
        }	
    	int number = num[index];
    	ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> clone = new ArrayList<Integer>();
    	for(ArrayList<Integer> list : previous){
    		  
    		  for(int j = 0; j <= list.size(); ++j){
    			  clone = (ArrayList<Integer>)list.clone();
    			  clone.add(j, number);
    			  current.add(clone);
    		  }
    	}
    	
    	permuteHelper(num, index+1, current, result);
    }*/
	//Method2: Solve Permutation with DFS
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		boolean[] visited = new boolean[num.length];
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		permuteHelper(num, 0, visited,tmp, result);
		return result;
	}
	public void permuteHelper(int[] num, int index, boolean[] visited, ArrayList<Integer> tmp,  ArrayList<ArrayList<Integer>> result){
		if(index == num.length){
            // duplicate element and add it to result (element would be changed from time to time. If directly use element  
            // only result would be changed when element changed)  
		    result.add(new ArrayList<Integer>(tmp));
			return;
		}
		for(int i = 0; i < num.length; ++i){
			if(!visited[i]){
				visited[i] = true;
				tmp.add(num[i]);
				permuteHelper(num, index+1,visited, tmp, result);
				// After providing a complete permutation, pull out the last number,
				visited[i] = false;
				tmp.remove(tmp.size()-1);
			}
		}
	}
}