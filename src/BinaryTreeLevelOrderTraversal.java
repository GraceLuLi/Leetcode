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
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();    	
    	if(root == null){
    		return result;
    	}

    	ArrayList<TreeNode> preNodes = new ArrayList<TreeNode>();
    	ArrayList<Integer> preList = new ArrayList<Integer>();
    	preNodes.add(root);
    	preList.add(root.val);
    	result.add(preList);
    	levelOrderHelper(preNodes, result);
    	return result;
        
    }
    
    public void levelOrderHelper(ArrayList<TreeNode> preNodes, ArrayList<ArrayList<Integer>> result){
    	ArrayList<TreeNode> currNodes = new ArrayList<TreeNode>();
    	ArrayList<Integer> currList = new ArrayList<Integer>();
    	for(TreeNode n : preNodes){
    		if(n.left != null){
    			currNodes.add(n.left);
    			currList.add(n.left.val);
    		}
    		if(n.right != null){
    			currNodes.add(n.right);
    			currList.add(n.right.val);
    		}    		
    	}
    	if(currNodes.size() == 0){
    		return ;
    	}
    	result.add(currList);
    	levelOrderHelper(currNodes, result);   	
    }
}