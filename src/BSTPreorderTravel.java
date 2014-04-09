import java.util.ArrayList;

public class BSTPreorderTravel {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	preorderHelper(root, result);
    	return result;

        
    }
    public void preorderHelper(TreeNode root, ArrayList<Integer> result)
    {
    	if(root == null)
    	{
    		return;
    	}
    	result.add(root.val);
    	preorderHelper(root.left, result);
    	preorderHelper(root.right, result);
    }
}