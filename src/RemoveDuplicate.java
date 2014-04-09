/*
 * 2.1 write code to remove duplicates from an unsorted linked list.
 * Follow Up
 * how would you solve this problem if a temporary buffer is not allowed
 */

import java.util.*;

public class RemoveDuplicate{
	
	public static void removeDuplicate(LinkedListNode n){
		
		LinkedListNode workNode = n;
		LinkedListNode previous;
		LinkedListNode current;
		
		while(workNode != null)
		{
			previous = workNode;
			current = workNode.next;
			while(current != null)
			{
				if(current.value == workNode.value)
				{
				   previous.next = current.next;
				   current = current.next;
				}
				else
				{
					previous = previous.next;
					current = current.next;
				}
				
			}
			workNode = workNode.next;
		}

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

		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n1;
		
		printList(n6);
		removeDuplicate(n6);
		printList(n6);
		
	}
}
