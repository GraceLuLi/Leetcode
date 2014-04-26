import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; ++i){
        	map.put(numbers[i], i);
        }
        for(int i = 0; i < numbers.length; ++i){
        	int num1 = numbers[i];
        	if(map.containsKey(target-num1)){
        		int i2 = map.get(target-num1);
        		if(i2 != i){
            		return new int[]{i+1, i2+1};
        		}
        	}
        }
        return null;
    }
}