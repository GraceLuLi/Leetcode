public class ReverseInteger {
    public int reverse(int x) {
    	int negative = 1;
    	if(x < 0){
    		negative = -1;
    		x = 0-x;
    	}
        
        int divisor = 10;
        int quotient = x/10;
        int remainder = x%10;
        if(quotient <= 0){
        	return negative*x;
        }
        int result = remainder;
        while(quotient > 0){
        	remainder = quotient%divisor;
        	quotient /= divisor;
        	result = result*10 + remainder;
        }
        return negative*result;
    }
}