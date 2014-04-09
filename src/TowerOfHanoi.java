import java.util.*;


public class TowerOfHanoi {
	
	
    static void moveDisk(int n, Stack<Integer> from, Stack<Integer> to, Stack<Integer> buffer)
    {
    	if(n == 1)
    	{
    		to.push(from.pop());
    		return;    	 
    	}
    	moveDisk(n-1, from, buffer,to);
    	to.push(from.pop());
    	moveDisk(n-1, buffer, to, from);
    
    }
    static void printTower(Stack<Integer> rod)
    {
      Stack<Integer> tmp = new Stack<Integer>();
      while(!rod.isEmpty())
      {
         System.out.print(rod.peek() + " ");
         tmp.push(rod.pop());
      }
      System.out.println();
      while(!tmp.isEmpty())
      {
         rod.push(tmp.pop());
      }
    }
    static public void main(String[] args){
    

    	Stack<Integer> rod1 = new Stack<Integer>();
    	Stack<Integer> rod2 = new Stack<Integer>();
    	Stack<Integer> rod3 = new Stack<Integer>();	
        rod1.push(3);
        rod1.push(2);
        rod1.push(1);
        System.out.print("1");
        printTower(rod1);
        System.out.print("2");
        printTower(rod2);
        System.out.print("3");
        printTower(rod3);
        
        moveDisk(3, rod1, rod3, rod2);
        
        System.out.print("1");
        printTower(rod1);
        System.out.print("2");
        printTower(rod2);
        System.out.print("3");
        printTower(rod3);
       
    }
}
