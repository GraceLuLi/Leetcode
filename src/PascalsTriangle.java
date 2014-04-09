import java.util.ArrayList;

public class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> preList = new ArrayList<Integer>();
    	if(numRows == 0){
    		return result;
    	}
    	preList.add(1);
    	result.add(preList);
    	int i = 1;
    	while(i < numRows){    		
    		preList = result.get(i-1);
    		ArrayList<Integer> currList = new ArrayList<Integer>();
    		currList.add(1);
    		for(int j = 0; j < preList.size()-1; ++j){
    			currList.add(preList.get(j)+ preList.get(j+1));
    		}
    		currList.add(1);
    		result.add(currList);
    		++i;
    	}
        return result;
    }
}