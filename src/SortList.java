import java.util.*;

public class SortList {
    public ListNode sortList(ListNode head) {
        

    	if(head == null || head.next == null)
    	{
    		return head;
    	}
    	ListNode head2 = head;
    	ListNode p1 = head;
    	ListNode p2 = head;
    	
    	while(p2 != null && p2.next != null)
    	{
    		p1 = head2;
    		head2 = head2.next;
    		p2 = p2.next.next;
    	}
    	p1.next = null;
    	
    	p1 = sortList(head);
    	p2 = sortList(head2);
    	
    	ListNode r;
    	if(p1.val <= p2.val)
    	{
    		r = p1;
    		p1 = p1.next;
    	}
    	else
    	{
    		r = p2;
    		p2 = p2.next;
    	}
    	ListNode resultHead = r;
    	while(p1 != null && p2 != null)
    	{
    		if(p1.val <= p2.val)
    		{
    		    r.next = p1;
     	        r = r.next;
     	        p1 = p1.next;
    		}
    		else
    		{
    			r.next = p2;
     	        r = r.next;
     	        p2 = p2.next;
    		}
    	}
    	if(p1 != null)
    	{
    		r.next = p1;
    	}
    	else if(p2 != null)
    	{
    		r.next = p2;
    	}
    	return resultHead;
    }
    	
}