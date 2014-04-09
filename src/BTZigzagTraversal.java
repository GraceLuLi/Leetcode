import java.util.*;

public class BTZigzagTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
    	ArrayList<TreeNode> currNodes = new ArrayList<TreeNode>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if(root == null){
    		return result;
    	}
    	currNodes.add(root);
    	list.add(root.val);
    	result.add(list);
    	zigzagOrderHelper(1,currNodes,result);
        return result;
    }
    public void zigzagOrderHelper(int level, ArrayList<TreeNode> preNodes, ArrayList<ArrayList<Integer>> result){
 
    	ArrayList<TreeNode> currNodes = new ArrayList<TreeNode>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = preNodes.size()-1; i >= 0; --i){
			TreeNode node = preNodes.get(i);
			if(level%2 == 1){
    			if(node.right != null){
        			currNodes.add(node.right);
        			list.add(node.right.val);
        		}
    			if(node.left != null){
        			currNodes.add(node.left);
        			list.add(node.left.val);
        		}
			}
			else{
    			if(node.left != null){
        			currNodes.add(node.left);
        			list.add(node.left.val);
        		}
    			if(node.right != null){
        			currNodes.add(node.right);
        			list.add(node.right.val);
        		}
			}
    	}
        if(currNodes.size() == 0){
        	return;
        }
        result.add(list);
        zigzagOrderHelper(level+1,currNodes,result);
    }
}