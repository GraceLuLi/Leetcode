
public class CountAndSay {
    public String countAndSay(int n) {
    	if(n <= 0){
    		return "";
    	}
        String s = "1";
        StringBuilder newS = new StringBuilder();
        while(--n > 0){
        	int i = 0;
        	newS.setLength(0);
        	while(i < s.length()){
        		int count = 0;
        		char c = s.charAt(i);
        		while(i < s.length() && s.charAt(i) == c){
        			++count;
        			++i;
        		}
        		newS.append(count);
        		newS.append(c);
        	}
        	s = newS.toString();
        }
        return s;
    }
    /*
     *     public String countAndSay(int n) {
    	if(n <= 0){
    		return "";
    	}
        String s = "1";
        String newS = "";
        while(--n > 0){
        	int i = 0;
        	newS = "";
        	while(i < s.length()){
        		int count = 0;
        		char c = s.charAt(i);
        		while(i < s.length() && s.charAt(i) == c){
        			++count;
        			++i;
        		}
        		newS += count;
        		newS += c;
        	}
        	s = newS;
        }
        return s;
    }
     */
}

