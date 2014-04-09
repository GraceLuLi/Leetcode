public class ValidPalindrome {
    public boolean isPalindrome(String s) {
    	int len = s.length();
        if(len == 0 || len == 1){
        	return true;
        }
        int i = 0;
        int j = len-1;
        char a;
        char b;
        while(i < j){
        	while(i < j && !(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i)))){
        		++i;
        	}
        	a = s.charAt(i);
        	while(i < j && !(Character.isLetter(s.charAt(j))||Character.isDigit(s.charAt(j)))){
        		--j;
        	}
        	b = s.charAt(j);
        	if(i > j || Character.toLowerCase(a) != Character.toLowerCase(b)){
        		return false;
        	} 
        	++i;
        	--j;
        }
        return true;
    }
}