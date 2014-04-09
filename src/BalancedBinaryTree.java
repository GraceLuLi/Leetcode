
public class BalancedBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        return minDepthHelper(root);
        
    }
    public int minDepthHelper(TreeNode root)
    {
        if(root.left == null && root.right == null)
        {
            return 1;
        }
        else if(root.left == null)
        {
        	return minDepth(root.right);
        }
        else if(root.right == null)
        {
        	return minDepth(root.left);
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
