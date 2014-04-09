public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
    	
    	return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean isValidBSTHelper(TreeNode node, int min, int max){
    	if(node == null){
    		return true;
    	}
    	if(node.val <= min || node.val >= max){
    		return false;
    	}
        return (isValidBSTHelper(node.left, min, node.val)&&isValidBSTHelper(node.right, node.val, max));

    }
}