public class LongestSubstringWithoutRepeatChar {
    public static int lengthOfLongestSubstring(String s) {
    	
        boolean[] checker = new boolean[26];
        int num = 0;
        int maxNum = 0;
        for(int i = 0; i < s.length(); ++i){
        	int tmp = s.charAt(i) - 'a';
        	if(checker[tmp] == false){
        		++num;
        		checker[tmp] = true;
        	}
        	else{
        		maxNum = Math.max(maxNum, num);
        		int preRepeatIndex = i-1;
        		num = 1;
        		checker = new boolean[26];
        		checker[tmp] = true;
        		while((int)s.charAt(preRepeatIndex) != (int)s.charAt(i)){
        			++num;
        			checker[s.charAt(preRepeatIndex)-'a'] = true;
        			--preRepeatIndex;
        		}
        	}
        }
        maxNum = Math.max(maxNum, num);
        return maxNum;
    }
    
    public static void main(String[] args){
       String str = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
       int result = lengthOfLongestSubstring(str);
       System.out.println(result);
    }
}