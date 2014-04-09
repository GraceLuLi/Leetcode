/*
 * How would you design a stack which, in addition to push and pop, also has a function min which
 * returns the minimum element? Push, pop and min should all operate in O(1) time
 */

import java.util.*;

public class StackWithMin extends Stack<Integer> {
	
	Stack<Integer> minValuesStack;
	StackWithMin()
	{
		minValuesStack = new Stack<Integer>();
	}
	
	public void push(int v)
	{
		if(v <= minValuesStack.peek())
		{
			minValuesStack.push(v);
		}
		super.push(v);
	}
	
	@Override
	public Integer pop()
	{
		int value = super.pop();
		if(value== minValuesStack.peek())
		{
			minValuesStack.pop();
		}
		
		return value;		
	}
	
	@Override
	public Integer peek()
	{
		return super.peek();
	}
	
	public Integer min()
	{
		return minValuesStack.peek();
	}
	
 
}
