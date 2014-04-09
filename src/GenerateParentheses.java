import java.util.ArrayList;

public class GenerateParentheses {
    public ArrayList<String> generateParenthesis(int n) { 
    	ArrayList<String> result = new ArrayList<String>();
        parenthesisHelper(n, n, "", result);
        return result;        
    }  
    public void parenthesisHelper(int left, int right, String parenthsis, ArrayList<String> result){
    	if(left == 0){
    		while(right > 0){
    			parenthsis += ")";
    			--right;
    		}
    		result.add(parenthsis);
    		return;
    	}
    	if(left > right){
    		return;
    	}
    	else if(left == right){
    		parenthesisHelper(left-1, right, parenthsis+"(", result);
    	}
    	else{
    		parenthesisHelper(left-1, right, parenthsis+"(", result);
    		parenthesisHelper(left, right-1, parenthsis+")", result);
    	}
    }

}