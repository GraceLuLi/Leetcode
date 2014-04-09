
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null || head.next == null){
    		return null;
    	}
    	ListNode pre = head;
    	ListNode p1 = head;
    	ListNode p2 = head;
    	for(int i = 0; i < n; ++i){
    		if(p2 == null){
    			return head;
    		}
    		p2 = p2.next;
    	}
    	while(p2 != null){
            pre = p1;
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	if(p1 == head){
    		return head.next;
    	}
    	pre.next = p1.next;
    	return head;        
    }
}