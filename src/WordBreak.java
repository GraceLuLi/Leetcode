import java.util.*;

public class WordBreak {
	
	 public boolean wordBreak(String s, Set<String> dict) {
	        
		 int len = s.length();
		 boolean[][] checker = new boolean[len][len];
		 
		 for(int i = 0; i < len ; ++i)
		 {
			 if(dict.contains(s.substring(i,i+1)))
			 {
				 checker[i][i] = true;				 
			 }
		 }
		 
		 for(int i = 1; i < len ; ++i)
		 {
			 
			 for(int j = 0;  j < len -i; ++j) {
				 int x = j + i;
				 int y = j;
				 
				 String current = s.substring(y, x+1);
				 if(dict.contains(current) ) 
				 {
					 checker[x][y] = true;
				 }
				 else
			     {
					 for(int k = y+1; k <= x; ++k)					
				     {
					    if(checker[x][k] && checker[k-1][y]) {
					        checker[x][y] = true;
					        break;
					    }
					    
				     }
			     }
			 }
		 }
		 
		 return checker[len-1][0];
	 }
	
}
