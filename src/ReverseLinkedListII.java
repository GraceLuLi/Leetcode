public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m >= n){
            return head;
        }
        ListNode pre = null;
        ListNode n1 = head;
        ListNode n2 = head;
        
        int i = 1;
        while(i < m){
            if(n1 == null){
                return head;
            }
            pre = n1;
            n1 = n1.next;
            ++i;
        }
        ListNode h1 = n1;
        while(i < n){
            if(n1.next == null){
               return head;
            }
            n2 = n1.next;
            n1.next = n2.next;
            n2.next = h1;
            h1 = n2;
            ++i;
        }
        if(pre == null){
            head = n2;
        }
        else{
            pre.next = n2;
        }
        return head;
    }
}