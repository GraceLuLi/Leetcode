import java.util.*;

public class UniqueChar {
	/*
	public static boolean hasUniqueChar(String s){
		char[] aString = s.toCharArray();
		int[] checker = new int[256];
		for(int i = 0; i < aString.length; i++)
		{
			if(checker[aString[i]] > 0)
			{
				return false;
			}
			checker[aString[i]]++;
		}
		return true;
	}
	*/
	public static boolean hasUniqueChar(String s){
		int checker = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int comparer = 1 << ( c-'a');
			if((checker & comparer) !=  0)
			{
				return false;
			}
			checker |= comparer;
		}
		return true;
	}

	
	
	public static void main(String[] args){
		System.out.println( hasUniqueChar("abcdefg"));
		System.out.println( hasUniqueChar("abcddfg"));
	}

}
