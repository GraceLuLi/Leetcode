public class ReverseWords {
    public String reverseWords(String s) {
        if(s == null || s == ""){
        	return s;
        }

        StringBuilder re = new StringBuilder();
    	int startP = 0, endP = 0;
        for(int i = s.length()-1; i >= 0; --i){
        	while(i >= 0 && s.charAt(i) == ' '){
        		--i;
        	}
        	if(i < 0){
        		break;
        	}
        	endP = i;
        	while(i >= 0 && s.charAt(i) != ' '){
        		startP = i;
        		--i;
        	}
        	if(startP <= endP && re.length() > 0){
        		re.append(' ');
        	}
        	for(int j = startP; j <= endP; ++j){
        		re.append(s.charAt(j));
        	}
        }
    
    	return re.toString();
    }
}