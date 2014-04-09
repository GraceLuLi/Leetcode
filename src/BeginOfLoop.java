/*
 * Given a circular linked list, implement an algorithm which returns node at the beginning of the loop
 */
public class BeginOfLoop {
	
	public static LinkedListNode FindBeginning(LinkedListNode n)
	{
		LinkedListNode p1 = n;
		LinkedListNode p2 = n;
		
		while(p1 != null && p2.next != null)
		{
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1 == p2)
			{
				break;
			}
		}
		if(p2.next == null)
		{
			return null; // error, there is not meeting point
		}
		p1 = n;
		while(p1 != p2)
		{
			p1 = p1.next;
		    p2 = p2.next;
		}
		return p2;
		
	}

}
