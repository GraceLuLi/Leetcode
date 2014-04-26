
public class ImplementStrStr {
    public static String strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0){
        	return haystack;
        }
        if(haystack == null || haystack.length() == 0){
        	return null;
        }
        int hLen = haystack.length();
        int nLen = needle.length();
        
        for(int startIndex = 0; startIndex < hLen-nLen+1; ++startIndex){
        	int i = startIndex;
            int j = 0;
            while(i < hLen && j < nLen){
            	if(haystack.charAt(i) != needle.charAt(j)){
            		break;
            	}
            	++i;
            	++j;
            	if(j == nLen){
            		return haystack.substring(startIndex);
            	}
            }
        }
        return null;
    }
    public static void main(String[] args){
    	String a = strStr("a", "a");
    	System.out.print(a);
    }
}
