/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class RecoverBinarySearchTree {
    TreeNode pre;
    TreeNode first;
    TreeNode second;
    public void recoverTree(TreeNode root) {
	  inorder(root);
	  if(first != null && second != null){
		  int tmp = first.val;
		  first.val = second.val;
		  second.val = tmp;
	  }
    }
    public void inorder(TreeNode root){
    	if(root == null){
    		return;
    	}
    	inorder(root.left);
    	if(pre != null && pre.val > root.val){
    		if(first == null){
    			first = pre;
    		}
    		second = root; // if using else, can judge the situation with only two nodes
    	}
    	pre = root;
    	inorder(root.right);
    }
}
