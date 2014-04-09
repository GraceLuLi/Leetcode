import java.util.ArrayList;

public class mergeKLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
    	int size = lists.size();
    	if(0 == size){
    		return null;
    	}
    	if(1 == size){
    		return lists.get(0);
    	}
    	if(2 == size){
    		return mergeTwoLists(lists.get(0), lists.get(1));
    	}
    	ArrayList<ListNode> lists1 = new ArrayList<ListNode>();
    	ArrayList<ListNode> lists2 = new ArrayList<ListNode>();
        for(int i = 0; i <= size/2; ++i){
        	lists1.add(lists.get(i));
        }
        for(int i= size/2+1; i < size; ++i){
        	lists2.add(lists.get(i));
        }
        ListNode n1 = mergeKLists(lists1);
        ListNode n2 = mergeKLists(lists2);
        return mergeTwoLists(n1, n2);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
    	ListNode p = null;
    	ListNode head = null;
    	if(l1.val < l2.val){
    		head = l1;
    		p = l1.next;
    		l1.next = null;
    		head.next = mergeTwoLists(p, l2);
    	}
    	else{
    		head = l2;
    		p = l2.next;
    		l2.next = null;
    		head.next = mergeTwoLists(l1, p);
    	}
    	return head;	
        
    }
}
