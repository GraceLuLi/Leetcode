import java.util.ArrayList;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeInorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) { 	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	traversalHelper(root, result);
    	return result;
    }
    
    public void traversalHelper(TreeNode root, ArrayList<Integer> result){
    	
    	if(root == null){
    		return;
    	}
    	traversalHelper(root.left, result);
    	result.add(root.val);
    	traversalHelper(root.right, result);
    }
}