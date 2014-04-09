import java.util.*;

public class evalRPN{
	public static void main(String[] args){
		  String[] aStr = {"0", "3", "/"};
		  int result = evalRPN(aStr);
		  System.out.println(result);
	}
	  
  public static int evalRPN(String[] tokens) {
      
    Stack<String> s = new Stack<String>();
          int i = 0;
          while(i < tokens.length)
          {
        	  String current = tokens[i];
              if(isInteger(current))
              {
                    s.push(current);
              }
              else
              {
                   int a = Integer.parseInt(s.pop());
                   int b = Integer.parseInt(s.pop());
                   int c = 0;
                   
                   switch(current){

                     case "+": c = a+b;
                             break;
                     case "-": c = b-a;
                             break;
                     case "*": c = a*b;
                             break;
                     case "/": c = b/a; 
                             break;
                     default: break;
                     
                  }
                  
                   String str = c+"";
                  s.push(str);
              }
             i++;
        }
          return Integer.parseInt(s.pop());
   }

  public static boolean isInteger(String str)
  {
     if(str.equals("+") || str.equals("-") ||str.equals("*") || str.equals("/"))
     {
            return false;
     }
     return true;
  }
}