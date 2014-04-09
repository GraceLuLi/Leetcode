import java.util.*;

public class BSTPostorderTravel {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	postorderHelper(root, result);
    	return result;       
    }
    public void postorderHelper(TreeNode root, ArrayList<Integer> result)
    {
    	if(root == null)
    	{
    		return;
    	}
    	postorderHelper(root.left,result);
    	postorderHelper(root.right, result);
    	result.add(root.val);
    }
}
