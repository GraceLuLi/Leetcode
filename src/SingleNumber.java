import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] A) {
       int result = A[0];
       for(int i = 1; i < A.length; i++)
       {
    	   result ^= A[i];
       }
       return result;
    }    
    
}