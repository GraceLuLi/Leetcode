import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterCombinationsOfPhone {
    public ArrayList<String> letterCombinations(String digits) {
    	
        ArrayList<String> result = new ArrayList<String>();
        if(digits == null){
        	return result;
        }
        if(digits.equals("")){
        	result.add("");
        	return result;
        }
        Map<Integer,String[]> table = new HashMap<Integer,String[]>();
        table.put(2,new String[]{"a","b","c"});
        table.put(3,new String[]{"d","e","f"});
        table.put(4,new String[]{"g","h","i"});
        table.put(5,new String[]{"j","k","l"});
        table.put(6,new String[]{"m","n","o"});
        table.put(7,new String[]{"p","q","r","s"});
        table.put(8,new String[]{"t","u","v"});
        table.put(9,new String[]{"w","x","y","z"});

        int key = Integer.parseInt( digits.substring(0,1));
        String[] letters = table.get(key);
        for(String letter : letters){
        	result.add(letter);
        }
        
        combinationsHelper(digits, 1, table, result);
        return result;
        
    }
    public void combinationsHelper(String digits, int index, Map<Integer,String[]> table, ArrayList<String> result){
    	if(index >= digits.length()){
    		return;
    	}
    	int key = Integer.parseInt( digits.substring(index,index+1));
    	String[] letters = table.get(key);
		ArrayList<String> newResult = new ArrayList<String>();
    	for(int i = 0; i < letters.length; ++i){
    		String letter = letters[i];
        	for(String preStr : result){
        			newResult.add(preStr+letter);
        	}
    		
    	}
    	result = newResult;
    	combinationsHelper(digits,index+1,table,result);
    }
    public static void main(String[] args){
    	ArrayList<String> l = new ArrayList<String>();
    	String a = "";
    	System.out.print(a.length());
    	if(a.equals("")){
    		l.add("");
    	}
    	
    	System.out.print(l.size());
    }
}
