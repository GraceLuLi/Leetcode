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
public class PartitionList {
	    public ListNode partition(ListNode head, int x) {
	    	if(head == null || head.next == null){
	    	    return head;
	    	}
	    	ListNode p1 = null;
	    	ListNode p2 = null;
	    	ListNode h1 = null;
	    	ListNode h2 = null;
	    	ListNode pre = head;
	    	ListNode runner = head;
	    	while(runner != null){
	    		if(runner.val < x){
	    			if(p1 == null){
	    				h1 = runner;
	    				p1 = h1;
	    			}
	    			else{
	        			p1.next = runner;
	    			    p1 = p1.next;
	    			}

	    		}
	    		else{
	    			if(p2 == null){
	    				h2 = runner;
	    				p2 = h2;
	    			}
	    			else{
		       			p2.next = runner;
	    			    p2 = p2.next;  
	    			}
	    		}
	    		pre = runner;
	    		runner = runner.next;
	    		pre.next = null;
	    	}
	    	if(h1 == null){
	    	    return h2;
	    	}
	        p1.next = h2;
	        return h1;		
	    }
	
}