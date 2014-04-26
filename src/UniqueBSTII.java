import java.util.ArrayList;
import java.util.HashMap;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class UniqueBSTII {
    public ArrayList<TreeNode> generateTrees(int n) {
    	return generateTrees(1, n);
    }
    public ArrayList<TreeNode> generateTrees(int start, int end){
    	ArrayList<TreeNode> r = new ArrayList<TreeNode>();
    	if(start > end){
    		r.add(null);
    		return r;
    	}
    	if(start == end){
    		r.add( new TreeNode(start));
    		return r;
    	}
    	for(int i = start; i <= end; ++i){

    		ArrayList<TreeNode> tmpLefts = generateTrees(start, i-1);
    		ArrayList<TreeNode> tmpRights = generateTrees(i+1, end);
    		for(TreeNode left : tmpLefts){
    			for(TreeNode right : tmpRights){
    	    		TreeNode tmp = new TreeNode(i);
    				tmp.left = left;
    				tmp.right = right;
    				r.add(tmp);
    			}
    		}
    	}
        return r;
    }
}
