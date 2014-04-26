
public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
    	if(p.length() == 0){
    		return s.length() == 0;
    	}
    	
    	String star = "";
    	String ss = s;
        
    	while(s.length() > 0) {
    		if(p.length() > 0 && (p.charAt(0) == '?' || p.charAt(0) == s.charAt(0))) {
    			s = s.substring(1);
    			p = p.substring(1);
    		}
    		else if(p.length() > 0 && p.charAt(0) == '*'){
    			star = p.substring(1);
    			ss = s;
    		}
    		else if(star.length() > 0){
    			p = star.substring(1);
    			ss = ss.substring(1);
    			s = ss;
    		}
    		else{
    			return false;
    		}
    	}
        while(p.length() > 0 && p.charAt(0) == '*'){
        	p = p.substring(1);
        }
        return p.length() == 0;
    }
    public static void main(String[] args){
    	//boolean b = isMatch("aa", "a*");
    	System.out.print("".length());
    }
}
