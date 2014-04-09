/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class MergeLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
    	ListNode p = null;
    	ListNode head = null;
    	if(l1.val < l2.val){
    		head = l1;
    		p = l1.next;
    		l1.next = null;
    		head.next = mergeTwoLists(p, l2);
    	}
    	else{
    		head = l2;
    		p = l2.next;
    		l2.next = null;
    		head.next = mergeTwoLists(l1, p);
    	}
    	return head;	
        
    }

}