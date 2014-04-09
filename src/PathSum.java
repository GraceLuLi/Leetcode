import java.util.*;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        
    	return  hasPathSumHelper(root, sum, 0);
        
    }
    
    public boolean hasPathSumHelper(TreeNode node, int sum, int preSum)
    {
        if(node == null)
        {
        	return false;
        }
        if(node.left == null && node.right == null)
        {
        	if(preSum + node.val == sum)
        	{
        		return true;
        	}
        	else
        	{
        		return false;
        	}
        }
        
        int currSum = preSum + node.val;
        return (hasPathSumHelper(node.left, sum, currSum) || hasPathSumHelper(node.right, sum, currSum));     
    	
    }
}