import java.util.*;

public class InsertionSort {
    public ListNode insertionSortList(ListNode head) {
        
    	if(head == null || head.next == null)
    	{
    		return head;
    	}
    	ListNode preRunner; 
    	ListNode runner;
    	ListNode preP = head;
    	ListNode p = head.next;
    	while(p != null)
    	{
    		preRunner = null;
    		runner = head;
    		int insertionChecker = 0;
    		while(runner != p)
    		{
    			if(runner.val > p.val)
    			{
    				preP.next = p.next;
    				if(preRunner == null)
    				{
    					p.next = runner;
    					head = p;
    				}
    				else
    				{
    					preRunner.next = p;    					
    				    p.next = runner;
    				}
    				insertionChecker = 1;
    				break;
    			}
    			preRunner = runner;
    			runner = runner.next;
    		}
    		if(insertionChecker == 1)
    		{
    			p = preP.next;
    		}
    		else
    		{    			
    		    preP = p;
    		    p = p.next;
    		}

    	}
    	return head;
    }
}
