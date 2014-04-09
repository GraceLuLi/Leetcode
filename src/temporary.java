import java.util.*;

public class temporary {
    public static int[] Fibonacci(int n) {
    	int[] r = new int[n+1];
    	r[0] = 0;
    	r[1] = 1;
        for(int i = 2; i <= n; ++i){
        	  r[i] = r[i-1] + r[i-2];
        }
        return r;
    }


    public static void main(String[] args){
    	int[] result = Fibonacci(9);
    	for(int i = 0; i < result.length; ++i){
    		System.out.print(" "+result[i]);
    	}
    }
}