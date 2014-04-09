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
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1, l2, 0);
    }
    
    public ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry)
    {
        if(l1 == null && l2 == null){
        	if(carry == 0){
        		return null;
        	}
        	return new ListNode(1);
        }
    	int sum = (l1 == null? 0:l1.val) + (l2 == null? 0:l2.val) + carry;
    	ListNode sumNode = new ListNode(sum%10);
    	carry = sum/10;
    	sumNode.next = addTwoNumbersHelper(l1 != null? l1.next:null,
    			                           l2 != null? l2.next:null, carry);
    	return sumNode;
    }
}
