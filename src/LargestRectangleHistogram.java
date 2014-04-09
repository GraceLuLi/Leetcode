import java.util.*;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] height) {
       int[] h = new int[height.length+1];
       h = Arrays.copyOf(height, height.length+1);
       Stack<Integer> stack = new Stack<Integer>();
       int maxArea = 0;
       int index = 0;
       while( index < h.length){
    	   if(stack.isEmpty() || h[stack.peek()] < h[index]){
    		   stack.push(index++);
    	   }
    	   else{
    		   int currIndex = stack.pop();
    		   maxArea = Math.max(maxArea, h[currIndex]*(stack.isEmpty()? index:(index - stack.peek() -1)));
    	   }
       }
       return maxArea;
    }
}