import java.util.*;

public class LetterCombinationsOfPhone {
    public ArrayList<String> letterCombinations(String digits) {
    	
        ArrayList<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0){
        	return result;
        }
        if(digits.length() == 0){
            result.add("");
            return result;
        }
        HashMap<Character,String[]> table = new HashMap<Character,String[]>();
        table.put('2',new String[]{"a","b","c"});
        table.put('3',new String[]{"d","e","f"});
        table.put('4',new String[]{"g","h","i"});
        table.put('5',new String[]{"j","k","l"});
        table.put('6',new String[]{"m","n","o"});
        table.put('7',new String[]{"p","q","r","s"});
        table.put('8',new String[]{"t","u","v"});
        table.put('9',new String[]{"w","x","y","z"});
        
       Combinations(digits, table, "", result);
       return result;
    }
    public void Combinations(String digits, HashMap<Character,String[]> table, String tmp, ArrayList<String> res){
        if(digits.length() == 0){
        	res.add(tmp);
        	return;
        }
        char c = digits.charAt(0);
        String[] list = table.get(c);
        for(int i = 0; i < list.length; ++i){
        	Combinations(digits.substring(1), table, tmp+list[i], res);
        }
    }
}
