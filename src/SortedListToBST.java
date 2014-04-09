/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
        	return null;
        }
        if(head.next == null){
        	return new TreeNode(head.val);
        }
        ListNode pre = head;
    	ListNode p1 = head;
    	ListNode p2 = head;
    	while(p2 != null && p2.next != null){
    		pre = p1;
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}
    	TreeNode node = new TreeNode(p1.val);
    	pre.next = null;
    	ListNode post = p1.next;
    	p1.next = null;
    	node.left = sortedListToBST(head);
    	node.right = sortedListToBST(post);
    	return node;
    }
}