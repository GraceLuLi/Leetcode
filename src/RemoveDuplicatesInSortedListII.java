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
public class RemoveDuplicatesInSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
    	
    	if(head == null || head.next == null)
    		return head;
    	ListNode pre = null;
    	ListNode curr = head;
    	ListNode post = head.next;
    	
    	while(post != null)
    	{
    		if(curr.val != post.val)
    		{
    			pre = curr;
    			curr = curr.next;
    			post = post.next;
    		}
    		else
    		{
    			while(post != null && curr.val == post.val)
    			{
    				post = post.next;
    			}
    			if(post == null)
    			{
    				if(pre == null)
    					return null;
    				else
    				{
    					pre.next = post;
    					return head;
    				}
    			}
    			if(pre == null)  //post != null
    			{
    				head = post;     // delete all the node in front, set a new head
    			}
    			else       //pre != null && post != null
    			{
    				pre.next = post;
    			}
				curr = post;
				post = post.next;
    		}
    	}    		
        return head;
    }
}