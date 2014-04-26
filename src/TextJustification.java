import java.util.ArrayList;

public class TextJustification {
    public static ArrayList<String> fullJustify(String[] words, int L) {
    	ArrayList<String> result = new ArrayList<String> ();
    	int lineLen = 0;
    	int interCount = 0;
    	int wordsLen = 0;
    	String line = "";
    	int i = 0;
    	while(i < words.length) {
    		lineLen = -1;
    		interCount = -1;
    		wordsLen = 0;
    		while(i < words.length && lineLen + 1 + words[i].length() <= L){
    			++interCount;
    			wordsLen += words[i].length();
    			lineLen += (1 + words[i].length());
    			++i;
    		}
    		line = "";
    		int interSpaceNum = (interCount == 0 ? 0 : (L - wordsLen)/interCount);
    		String interSpace = "";
    		for(int j = 0; j < interSpaceNum; ++j){
    			interSpace += " ";
    		}
    		int remainder = (interCount == 0 ? (L - wordsLen) : (L - wordsLen)%interCount);
    		line += words[i-1-interCount];
    		if(i == words.length){
    			remainder = L - wordsLen;
    			for(int j = i-interCount; j < words.length; ++j){
    				line += (" " + words[j]);
    				--remainder;
    			}
    		}else{
    			for(int j = i-interCount; j < i; ++j){
        			line += interSpace;
        			if(remainder-- > 0) line += " ";
        			line += words[j];
        		}
    		}
    		for(int j = 0; j < remainder; ++j){
    			line += " ";
    		}
    		result.add(line);
    	}
    	return result;
    }
    
    public static void main(String[] args){
    	String[] words = new String[]{""};
    	ArrayList<String> result = fullJustify(words, 0);
    }
}
