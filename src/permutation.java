import java.util.*;

public class permutation {
	
	public static boolean isPermutation(String a, String b){
		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		if(aChar.length != bChar.length)
		{
			return false;
		}
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		for(int i = 0; i < aChar.length; i++)
		{
			if(aChar[i] != bChar[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isPermutation("waterpool", " powaolter"));
		System.out.println(isPermutation("waterpoola", "powaolterr"));
		System.out.println(isPermutation("", "  "));
	}

}
