/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class PopulateRightNext {
    public void connect(TreeLinkNode root) {
    	if(root == null){
    		return;
    	}
    	ArrayList<TreeLinkNode> preNodes = new ArrayList<TreeLinkNode>();
    	preNodes.add(root);
    	connectHelper(preNodes);        
    }
    public void connectHelper(ArrayList<TreeLinkNode> preNodes){
    	if(preNodes.size() == 0){
    		return;
    	}
    	ArrayList<TreeLinkNode> currNodes= new ArrayList<TreeLinkNode>();
    	int i=0;
    	while(i < preNodes.size()){
    	   TreeLinkNode curr = preNodes.get(i);
    	   if(curr.left != null){
    		   currNodes.add(curr.left);
    	   }
    	   if(curr.right != null){
    		   currNodes.add(curr.right);
    	   }
    	   if(i+1 == preNodes.size()){
    		   curr.next = null;
    	   }
    	   else{
    		   curr.next = preNodes.get(i+1);
    	   }
    	   i++;
    	}
    	connectHelper(currNodes);
    }
}