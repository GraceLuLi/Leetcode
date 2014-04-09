public class IntToRoman {
    public static String intToRoman(int num) {
        String result = "";
        if(num > 3999){
        	return result;
        }
        int divisor = 1000;
        int divided = num;
        while(divisor > 0){
        	if(divided/divisor == 0){
        		divisor /= 10;
        		continue;
        	}
        	int digit = divided/divisor;
        	result += digitToRoman(digit, divisor);
        	divided %= divisor;
        	divisor /= 10;
        }
        return result;
    }
    public static String digitToRoman(int digit, int divisor){
    	String result = "";
    	String a = "", b = "", c = "";
    	switch(divisor){
    	case 1000:
    		c = "M";
    		break;
    	case 100:
    		a = "M"; b = "D"; c = "C";
    		break;
    	case 10:
    		a = "C"; b = "L"; c = "X";
    		break;
    	case 1:
    		a = "X"; b = "V"; c = "I";
    		break;
    	default:
    		break;
    	}

    	if(digit <= 3){
            while(digit > 0){
            	result += c;
            	--digit;
            }
    	}
    	else if(digit > 3 && digit < 5){
    		int i = 5 - digit;
    		while(i > 0){
    			result += c;
    			--i;
    		}
    		result += b;
    	}
    	else if(digit >= 5 && digit <= 8){
    		int i = digit - 5;
    		result += b;
    		while(i > 0){
    			result += c;
    			--i;
    		}
    	}
    	else if(digit == 9){
    		result += c;
    		result += a;
    	}
    	return result;
    }
    
  public static void main(String[] args){
	  String s = intToRoman(1000);
	  System.out.print(s);
  }
}