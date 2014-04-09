/*
 * write code to partition a linked list around a value x, such that all nodes
 * less than x come before all nodes greater than or equal to x.
 */
public class PartitionPivot {
	
	public static LinkedListNode partitionPivot(LinkedListNode n, int x){
		
		LinkedListNode beforeX = null;
		LinkedListNode afterX = null;
		LinkedListNode current = n;
		LinkedListNode head;
		while(current != null )
		{
			LinkedListNode next = current.next;
			if(current.value < x)
			{
				current.next = beforeX;
				beforeX = current;
			}
			else
			{
				current.next = afterX;
				afterX = current;
			}
			current = next;
		}
		printList(beforeX);
		printList(afterX);
		if(beforeX != null)
		{
			head = beforeX;
			while(beforeX.next != null)
			{
				beforeX = beforeX.next;
			}
			beforeX.next = afterX;
		}
		else 
		{
			head = afterX;
		}
			
		return head;
	}
	public static void printList(LinkedListNode n){
		while(n != null)
		{
			System.out.print(n.value + " ");
			n = n.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		LinkedListNode n1 = new LinkedListNode(3);
		LinkedListNode n2 = new LinkedListNode(3);
		LinkedListNode n3 = new LinkedListNode(6);
		LinkedListNode n4 = new LinkedListNode(2);
		LinkedListNode n5 = new LinkedListNode(2);
		LinkedListNode n6 = new LinkedListNode(3);
        n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		
		printList(n1);
		LinkedListNode n = partitionPivot(n1, 3);
		printList(n);
		
	}

}
