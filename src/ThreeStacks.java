import java.util.*;
/*
 * Describe how you could use a single array to implement three stacks
 */
public class ThreeStacks {
	
	int StackSize = 100;
	StackNode[] buffer = new StackNode[StackSize*3];
	int[] indexs = {-1,-1,-1};
	int lastFreeIndex = 0;
     
    int peek(int StackNum)
    {
    	int position = indexs[StackNum];
        return  buffer[position].value;
    }
    int pop(int StackNum)
    {
    	if(isEmpty(StackNum))
    	{
    		System.out.print("Pop from empty stack");
    		return Integer.MIN_VALUE;
    	}
    	int position = indexs[StackNum];
    	StackNode current = buffer[position];
    	int v = current.value;
    	indexs[StackNum] = current.preIndex; // set the indexs[StackNum] to previous index
    	current.preIndex = lastFreeIndex ; // add the new release space to free list
    	lastFreeIndex  = position;
    	return v;
    	
    }
    void push(int StackNum, int v)
    {
         StackNode lastFreeNode = buffer[lastFreeIndex];
         buffer[lastFreeIndex] = new StackNode(indexs[StackNum], v);
         indexs[StackNum] = lastFreeIndex;
         if(lastFreeNode == null) // the free space is at the end of buffer
         {       	 
        	 lastFreeIndex ++;
         }
         else
         {
        	 lastFreeIndex = lastFreeNode.preIndex; // the free space is in the middle of buffer       	 
         }    	
    }
    boolean isEmpty(int StackNum)
    {
    	if(indexs[StackNum] == -1)
    		return true;
    	return false;
    }
}
