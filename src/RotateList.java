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
public class RotateList {
    public static ListNode rotateRight(ListNode head, int n) {
        if(head == null || head.next == null || n <= 0){
        	return head;
        }
        ListNode p1 = head;
        ListNode pre = head;
        int len = 1;
        while(p1.next != null){
        	p1 = p1.next;
        	++len;
        }
        p1.next = head;
        p1 = head;
        int i = len - n%len;
        while(i > 0){
          pre = p1;
          p1 = p1.next; 
          --i;
        }
        pre.next = null;
        return p1;
    }
    public static void main(String[] args){
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
    	ListNode n = rotateRight(head, 1);
    }
}