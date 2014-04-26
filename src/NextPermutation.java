
public class NextPermutation {
    public void nextPermutation(int[] num) {
    	if(num == null || num.length < 2){
    		return;
    	}
        for(int i = num.length-1; i >= 1 ; --i){
        	if(num[i] > num[i-1]){
        		int tmp = num[i-1];
        		int j = num.length-1;
        		while(num[j] <= tmp){
        			--j;
        		}
        		num[i-1] = num[j];
        		num[j] = tmp;
        		reverse(num, i);
        		return;
        	}
        }
        reverse(num, 0);
    }
    public void reverse(int[] num, int start){
        int i = start;
        int j = num.length-1;
        while(i < num.length && j >= start && i < j){
    		int tmp = num[i];
    		num[i] = num[j];
    		num[j] = tmp;
    		++i;
    		--j;
        }
    }
}
