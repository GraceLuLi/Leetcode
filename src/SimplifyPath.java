import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        String[] list = path.split("/");
        Stack<String> s = new Stack<String>(); 
        for(int i = 0; i < list.length; ++i){
        	String curr = list[i];
        	if(".".equals(curr) || "".equals(curr)){
        		continue;
        	}
        	if("..".equals(curr)){
        		if(!s.isEmpty()) s.pop();
        	}
        	else{
        		s.push(curr);
        	}
        }
        String result = "";
    	while(!s.isEmpty()){
    		result = ("/" + s.pop()) + result;
    	}
    	if(result.length() == 0){
    	    result += "/";
    	}
    	return result;
    }
    
    public static void main(String[] args){
    	String s = "/...";
    	String r = simplifyPath(s);
    	System.out.print(r);
    	
    }
}
