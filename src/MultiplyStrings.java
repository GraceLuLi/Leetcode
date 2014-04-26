
public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int[] res = new int[len1+len2+1];
        if(len1 < len2){
        	multiply(n1, n2,0, res);
        }
        else{
        	multiply(n2, n1, 0, res);
        }
        String result = "";
        int i = 0;
    	while(i < res.length-1 && res[i] == 0){
    		++i;
    	}
        while(i < res.length){
        	result += res[i];
        	++i;
        }
        return result;
    }
    public static void multiply(char[] n1, char[] n2, int index, int[] res){//n1 is smaller than n2
    	if(index ==  n1.length){
    		return;
    	}
         char c1 = n1[n1.length-1-index];
         for(int i = n2.length-1; i >= 0; --i){
        	 char c2 = n2[i];
        	 int dist = n2.length-1 - i;
        	 int sum = res[res.length-1-dist-index] + ((c1-'0') * (c2 - '0')); 
        	 res[res.length-1-dist-index] = sum%10;
        	 res[res.length-2-dist-index] += sum/10;
         }
         multiply(n1, n2, index+1, res);
    }
    
    public static void main(String[] args){
    	String s = multiply("123", "456");
    	System.out.println(s);
    }
}
