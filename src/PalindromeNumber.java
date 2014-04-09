public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
    	int digits = 0;
    	int remainder = x;
    	while(remainder != 0){
    		++digits;
    		remainder /= 10;
    	}
    	if(digits == 1){
    		return true;
    	}
    	int i = (int)Math.pow(10,(digits-1));
        int startDigit = x;
        int endDigit = 0;
        remainder = x;
        while(i != 1 && remainder != 0){
        	startDigit = remainder/i;
        	endDigit = remainder%10;
        	if(startDigit != endDigit){
        		return false;
        	}
            remainder %= i;
            remainder /= 10;
            i /= 100;
        }
        return true;
    }

}