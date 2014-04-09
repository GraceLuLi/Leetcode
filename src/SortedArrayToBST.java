/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {   		
    	return ArrayToBSTHelper(num, 0, num.length-1) ;       
    }
    public TreeNode ArrayToBSTHelper( int[] num, int start, int end)
    {
    	if(start > end){
    		return null;
    	}
    	int mid = (start + end)/2;
    	int val = num[mid];
    	TreeNode node = new TreeNode(val);
    	node.left = ArrayToBSTHelper(num, start, mid-1);
    	node.right = ArrayToBSTHelper(num, mid+1, end);
    	return node;
    }
}
