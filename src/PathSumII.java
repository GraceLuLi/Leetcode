import java.util.*;

public class PathSumII {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    	
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> buffer = new ArrayList<Integer>(); 
        pathSumHelper(root,sum,0,buffer,result);
        return result;
    }
    
    public void pathSumHelper(TreeNode node, int sum, int preSum, ArrayList<Integer> buffer,ArrayList<ArrayList<Integer>> result)
    {
    	
    	if(node == null)
    	{
    		return ;
    	}
    	int currSum = preSum + node.val;
    	ArrayList<Integer> newBuffer = (ArrayList<Integer>) buffer.clone();
    	newBuffer.add(node.val);
    	if(node.left == null && node.right == null)
    	{
    		if(currSum == sum)
    		{
    			result.add(newBuffer);
    		}
    	}
    	
    	pathSumHelper(node.left, sum, currSum,newBuffer, result );
    	pathSumHelper(node.right, sum, currSum,newBuffer, result );
    }
}
