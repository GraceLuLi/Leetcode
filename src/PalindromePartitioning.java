import java.util.ArrayList;
public class PalindromePartitioning {
    public ArrayList<ArrayList<String>> partition(String s) {
    	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
    	if(s == null || "".equals(s.trim())){
    		return result;
    	}
    	ArrayList<String> tmpList = new ArrayList<String>();
        partition(s, tmpList, result);
        return result;
    }
    public void partition(String s, ArrayList<String> tmpList, ArrayList<ArrayList<String>> result){
    	if(s.length() ==  0){
    		result.add(new ArrayList<String>(tmpList));
    	}
    	for(int i = 1; i <= s.length(); ++i){
    		String head = s.substring(0, i);
    		if(isPalindrome(head)){
    			tmpList.add(head);
    			partition(s.substring(i), tmpList, result);
    			tmpList.remove(tmpList.size()-1);
    		}
    	}
    }
    public boolean isPalindrome(String s){
    	int i = 0;
    	int j = s.length()-1;
    	while(i  < s.length() && j >= 0 && i < j){
    		if(s.charAt(i++) != s.charAt(j--)){
    			return false;
    		}
    	}
    	return true;
    }
}
