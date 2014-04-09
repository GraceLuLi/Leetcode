import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
       if(s.length()%2 == 1){
    	   return false;
       }
       Stack<Character> buffer = new Stack<Character>();
        
        for(int i = 0; i < s.length(); ++i){
             char ch = s.charAt(i);
             if(buffer.empty()){
            	 if(ch == ')' || ch == ']' || ch == '}'){
            		 return false;
            	 }
            	 buffer.push(ch);
            	 continue;
             }
             char pre = buffer.peek();
             String expected = "";
             switch(pre){
             case '(': expected = ")({[";
            		 break;
             case '{': expected = "}({[";
                     break;
             case '[': expected = "]({[";
                     break;
             default:
            	    break;
            	 
             }
             if(ch == expected.charAt(0)){
            	 buffer.pop();
            	 continue;
             }
             else if(ch == expected.charAt(1) || ch == expected.charAt(2) || ch == expected.charAt(3)){
            	 buffer.push(ch);
            	 continue;
             }
             else{
            	 return false;
             }
        }
        if(!buffer.empty()){
        	return false;
        }
        return true;
    }
   
 public static void main(String[] args){
	 String s = "[({(())}[()])]";
	 boolean a = isValid(s);
	 System.out.println(a);
 }
}