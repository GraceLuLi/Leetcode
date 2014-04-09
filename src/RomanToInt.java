public class RomanToInt {
    public int romanToInt(String s) {
    	if(s == ""){
    		return 0;
    	}
        char[] strChar = s.toCharArray();
    	int len = strChar.length;
        int[] strInt = new int[len];
        for(int i = 0; i < len; ++i){
        	strInt[i] = romanDigit(strChar[i]);
        }
        int result = strInt[0];
        for(int i = 1; i < len; ++i){
        	if(strInt[i] > strInt[i-1]){
        		result -= strInt[i-1];
        		result += (strInt[i] - strInt[i-1]);
        	}
        	else{
        		result += strInt[i];
        	}
        }
        return result;
    }
    
    public int romanDigit(char a){
    	
        switch(a){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return -1;
        }
    }
}