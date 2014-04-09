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
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
    	
    	if(head == null || head.next == null){
    		return head;
    	}
    	ListNode pre = null;
    	ListNode p1 = head;
    	ListNode p2 = head.next;
    	ListNode post = null;
    	
    	while(p1 != null && p2 != null){
    		post = p2.next;
    		p1.next = post;
    		p2.next = p1;
    		if(pre == null){
    			head = p2;
    		}
    		else{
    			pre.next = p2;
    		}
    		if(post == null){
    			break;
    		}
    		pre = p1;
    		p1 = post;
    		p2 = post.next;
    	}
    	return head;	
        
    }
}
