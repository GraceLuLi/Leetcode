import java.util.Arrays;

public class ScrambleString {
    public boolean isScramble(String s1, String s2) {
    	if(!containsSameChars(s1, s2)){
    		return false;
    	}
        if(s1.equals(s2)){
        	return true;
        }
        for(int i = 1; i < s1.length(); i++){
        	String s11 = s1.substring(0,i);
        	String s12 = s1.substring(i);
        	
        	String s21 = s2.substring(0,i);
        	String s22 = s2.substring(i);
        	if(isScramble(s11, s21) && isScramble(s12, s22)){
        		return true;
        	}
        	s21 = s2.substring(s1.length()-i);
        	s22 = s2.substring(0, s1.length()-i);
        	if(isScramble(s11, s21) && isScramble(s12, s22)){
        		return true;
        	}
        }
    	return false;
    }
    public boolean containsSameChars(String s1, String s2){
    	char[] ch1 = s1.toCharArray();
    	char[] ch2 = s2.toCharArray();
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	for(int i = 0; i < ch1.length; ++i){
    		if(ch1[i] != ch2[i]){
    			return false;
    		}
    	}
    	return true;
    }

}