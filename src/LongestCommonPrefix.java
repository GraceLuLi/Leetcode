
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0){
    		return "";
    	}
        int maxLen = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; ++i){
        	if(strs[i].length() < maxLen){
        		maxLen = strs[i].length();
        	}
        }
        String common = "";
        boolean found;
        for(int end = maxLen; end > 0; --end){
        	common = strs[0].substring(0, end);
        	found = true;
            for(int i = 1; i < strs.length; ++i){
            	if(!common.equals(strs[i].substring(0, end))){
            		found = false;
            		break;
            	}
            }
            if(found){
            	return common;
            }
        }
        return "";
    }
    public static void main(String[] args){
    	String[] arr = new String[]{"aa", "ab"};
    	String a = longestCommonPrefix(arr);
    	System.out.print(a);
    }
}
