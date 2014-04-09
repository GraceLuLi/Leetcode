public class AddBinary {
    public static String addBinary(String a, String b) {
    	
    	String result = "";
    	int carry = 0;
    	int i = a.length();
    	int j = b.length();
    	String subA, subB;
    	int numA, numB;
    	while(i > 0 || j > 0){
    		int bitSum = carry;
    		if(i > 0){
    			subA = a.substring(i-1, i);
    			numA = Integer.parseInt(subA);
    			bitSum += numA;
    			--i;
    		}
    		if(j > 0){
    			subB = b.substring(j-1, j);
    			numB = Integer.parseInt(subB);
    			bitSum += numB;
        		--j;
    		}  		
    		carry = bitSum/2;
    		result = bitSum%2 + result;
    	}

    	if(carry == 1){
    		result = "1" + result;
    	}
  	    return result;    
    }
    
    public static void main(String[] args){
    	
    	String r = addBinary("0", "0");
    	System.out.print(r);
    }
    
}