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
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(head == null || head.next == null || k < 2){
    		return head;
    	}
        ListNode headOfAll = null;
        ListNode endOfReversed = null;
        
        ListNode start = head;
        ListNode end;
        while(start != null){
        	end = start;
            for(int i = 1; i < k; ++i){
            	if(end.next != null){
                	end = end.next;
            	}
            	else{
            		if(headOfAll == null){
            			return head;
            		}
            		else{
            			endOfReversed.next = start;
            			return headOfAll;
            		}
            	}
            }
            ListNode newStart = end.next;
            ListNode[] r = reverseRange(start, end);
            if(headOfAll == null){
            	headOfAll = r[0];
            	endOfReversed = r[1];
            }
            else{
            	endOfReversed.next = r[0];
            	endOfReversed = r[1];
            }
            start = newStart;
        }
        return headOfAll;   
    }
    public ListNode[] reverseRange(ListNode start, ListNode end){
    	end.next = null;
    	ListNode h = start;
    	ListNode p1 = start;
    	while(p1.next != null){
    		ListNode p2 = p1.next;
    		p1.next = p2.next;
    		p2.next = h;
    		h = p2;
    	}
    	return new ListNode[]{h ,p1};
    }
}
