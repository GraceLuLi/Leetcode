public class Sqrt {
    public static int sqrt(int x) {
        if(x <= 1){
        	return x;
        }
        return sqrtHelper(x, x, 1, x);
    }
    
    public static int sqrtHelper(int x, int num, int start, int end){
    	if(num > 46340){   ///num*num is the boundary of integer
    		 return sqrtHelper(x, num/2, start, num);
    	}
    	int product = num*num;
    	if( product == x){
    		return num;
    	}
    	if(end - start <= 1){
    		return start;
    	}
    	if( product > x){
    		return sqrtHelper(x, num/2, start, num);
    	}
    	else{
    		return sqrtHelper(x, (num+end)/2, num, end);
    	}
    }
   public static void main(String[] args){
	   int a = sqrt(2147395599);
	   System.out.println(a);
   }
}
