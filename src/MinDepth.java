import java.util.*;

public class MinDepth {
	
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
        	return minDepth(root.right) + 1;
        }
        else if(root.right == null)
        {
        	return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

}

// Method 2
/*
public int minDepth(TreeNode root) {
    if(root == null)
    {
        return 0;
    }
    if(root.left == null && root.right == null)
    {
        return 1;
    }
    int min = Integer.MAX_VALUE;
    if(root.left != null)
    {
    	min = Math.min(min, minDepth(root.left));
    }
    if(root.right != null)
    {
    	min = Math.min(min, minDepth(root.right));
    }
    return min;
}
*/