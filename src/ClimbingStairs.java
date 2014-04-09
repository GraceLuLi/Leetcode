import java.util.ArrayList;

public class ClimbingStairs {
    public int climbStairs(int n) {
        ArrayList<Integer> record = new ArrayList<Integer>();
        record.add(0);
        record.add(1);
        record.add(2);
        return climbStairsHelper(n, record);
        
        
    }
   public int climbStairsHelper(int n, ArrayList<Integer> record){
	   
	   if(n < record.size()){
		   return record.get(n);
	   }
	   int result = (climbStairsHelper(n-1, record) + climbStairsHelper(n-2,record));
	   record.add(result);
	   return result;
   }
}