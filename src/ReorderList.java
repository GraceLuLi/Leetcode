import java.util.*;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }
    	ListNode p1 = head;
    	ListNode p2 = head;
    	
    	while(p2 != null && p2.next != null)
    	{
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}
    	//p1 is the middle ListNode
    	//separate the first half and second half
    	
    	p2 = p1.next;
    	p1.next = null;
    	
    	ListNode tmp;
    	ListNode h2 = p2;
    	// reverse the second half
    	while(p2 != null && p2.next != null)
    	{
    		tmp = p2.next;
    		p2.next = tmp.next;
    		tmp.next = h2;
    		h2 = tmp;
    	}
    	ListNode h1 = head;
    	while(h1 != null && h2 != null)
    	{
    		p1 = h1.next;
    		p2 = h2.next;
    		h1.next = h2;
    		h2.next = p1;
    		h1 = p1;
    		h2 = p2;
    	}
    }
}
