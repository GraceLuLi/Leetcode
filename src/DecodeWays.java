import java.util.Arrays;

public class DecodeWays {
    public static int numDecodings(String s) {

        int len = s.length();
        if(len == 0){
            return 0;
        }
        int[] record = new int[len+1];
        record[len] = 1;
        for(int i = len-1; i >= 0; --i){
        	char c = s.charAt(i);
        	if(c >= '1' && c <= '9'){
        		record[i] = record[i+1];
        		if(c == '1' && i <= len-2){
        			record[i] += record[i+2];
        		}
        		if( c == '2' && i <= len-2 && s.charAt(i+1) <= '6'){
        			record[i] += record[i+2];
        		}
        	}
        }
        return record[0];
    }
    public static void main(String[] args){
    	int re = numDecodings("10");
    	System.out.print(re);
    }
}