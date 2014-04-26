
public class MinimumWindowSubstring {
    public static String minWindow(String S, String T) {
        if(S.length() == 0){
    		return T.length()==0? "" :null;
    	}
    	if(S.length() < T.length()){
    		return null;
    	}
        int[] pattern = new int[128];
        int[] checker = new int[128];
        String minWin = "";
        for(int i=0; i < T.length(); ++i){
        	pattern[T.charAt(i)] += 1;
        }
        int tail = 0;
        int head = 0;
        int noMatchedNum = T.length();
        String currWin = "";
        while(head < S.length()){
        	char c = S.charAt(head);
        	checker[c] += 1;
        	if(pattern[c] == checker[c]){
        		noMatchedNum -= pattern[c];
        	}
        	if(noMatchedNum == 0){
        		break;
        	}
        	++head;
        }
        
        while(tail < head && checker[S.charAt(tail)] > pattern[S.charAt(tail)]){
        	checker[S.charAt(tail)] -= 1;
            ++tail;
        }
        currWin = S.substring(tail, head);
        minWin = currWin; // get first window
        System.out.println(head);
        while(head < S.length()){
        	char c = S.charAt(head);
        	if(pattern[c] > 0){// c is a character appear in T
        		++checker[c];
        		if(c == S.charAt(tail)){
        			while(tail < head && checker[S.charAt(tail)] > pattern[S.charAt(tail)]){
                    	checker[S.charAt(tail)] -= 1;
                        ++tail;
            		}
                    currWin = S.substring(tail, head+1);
                    if(currWin.length() < minWin.length()){
                    	minWin = currWin;
                    }
        		}	
        	}
        	++head;	
        }
        return minWin;	
    }
    public static void main(String[] args){
    	String win = minWindow("a", "a");
    	System.out.print("!" + win + "!");
    }
}
