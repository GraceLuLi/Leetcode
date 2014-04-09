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
public class RemoveDuplicatesInSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	
    	if(head == null || head.next == null) 
    		return head;
    	ListNode pre = head;
    	ListNode curr = head.next;
    	while(curr != null)
    	{
    		if(curr.val != pre.val)
    		{
    			pre = pre.next;
    			curr = curr.next;
    		}
    		else
    		{
    			while(curr != null && curr.val == pre.val)
    			{
    				curr = curr.next;
    			}
    			pre.next = curr;
    			if(curr == null)
    			{
    				return head;
    			}
    			pre = curr;
    			curr = curr.next;
    		}
    	}
        return head;
    }
}