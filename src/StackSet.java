/*
 * Imagine a (literal) stack of plates If the stack gets too high, it might topple There- fore, in real life, we would likely start a new stack when the previous stack exceeds some threshold Implement a data structure SetOfStacks that mimics this SetOf- Stacks should be composed of several stacks, and should create a new stack once the previous one exceeds capacity SetOfStacks push() and SetOfStacks pop() should behave identically to a single stack (that is, pop() should return the same values as it would if there were just a single stack)
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack
 */
import java.util.*;

public class StackSet {
	
	ArrayList<Stack<Integer>> set = new ArrayList<Stack<Integer>>();
	int StackSize = 5;
	
	public void push(int v)
	{
		
	}
	public Integer pop()
	{
		
		return 0;
	}
	
	public Integer peek()
	{
		return 0;
	}
	
    public boolean isEmpty()
    {
    	if(set.size() == 0)
    		return true;
    	return false;
    }
    public Integer popAt(int StackNum)
    {
    	
    	return 0;
    	
    }
    
	

}
