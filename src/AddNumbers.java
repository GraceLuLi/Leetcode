

public class AddNumbers {
     
	public static LinkedListNode addList(LinkedListNode n1, LinkedListNode n2, int carry)
	{
		if(n1 == null && n2 == null)
		{
			if(carry == 0) return null;
			return new LinkedListNode(carry);
		}
		LinkedListNode sum = new LinkedListNode(carry);
		if(n1 != null)
		{
			sum.value += n1.value;
		}
		if(n2 != null)
		{
			sum.value += n2.value;
		}
		carry = sum.value/10;
		sum.value = sum.value%10;
		sum.next = addList(n1 == null? null : n1.next, 
				           n2 == null? null : n2.next, carry);
		return sum;
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
		LinkedListNode n1 = new LinkedListNode(6);
		LinkedListNode n2 = new LinkedListNode(3);
		LinkedListNode n3 = new LinkedListNode(6);
		LinkedListNode n4 = new LinkedListNode(2);
		LinkedListNode n5 = new LinkedListNode(2);
		LinkedListNode n6 = new LinkedListNode(3);
    

		
		printList(n1);
		printList(n3);
		LinkedListNode sum =  addList(n1, n3,0);
		printList(sum);
		
	}

}
