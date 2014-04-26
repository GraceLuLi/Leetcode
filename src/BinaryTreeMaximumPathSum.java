/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};
    	maxSums(root, max);
    	return max[0];  
    }
    public int maxSums(TreeNode root, int[] max){// return max with root
    	if(root == null){
    		return 0;
    	}
    	int leftMax = maxSums(root.left, max);
    	int rightMax = maxSums(root.right, max);
    	int maxWithRoot = root.val;
    	max[0] = Math.max(root.val + leftMax + rightMax, max[0]);
    	maxWithRoot += Math.max(leftMax, rightMax);
    	maxWithRoot = Math.max(0, maxWithRoot);
    	return maxWithRoot;
    }
}