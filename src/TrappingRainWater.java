public class TrappingRainWater {
    public int trap(int[] A) {
        int len = A.length;
        if(len <= 1){
            return 0;
        }
        int i = 0;
        int j = len -1;
        int preLevel = 0;
        int preHigher = 0;
        int result = 0;
        while(i < len-1 && A[i] == 0){
        	++i;
        }
        while(j >= 0 && A[j] == 0){
        	--j;
        }
        while(i < j){
        	int h1 = A[i];
        	int h2 = A[j]; 
        	if(h1 < h2){
        		result += (j - i + 1)*(h1 - preLevel);
        		preLevel = h1;
        		while(i < len-1 && A[i] <= h1){
            		++i;
        		}
        	}
        	else{
        		result += (j - i + 1)*(h2 - preLevel);
        		preLevel = h2;
        		while(j >= 0 && A[j] <= h2){
            		--j;
        		}
        	}
        	preHigher = Math.max(h1, h2) - preLevel;
        }
        result += preHigher;
        for(int h : A){
        	result -= h;
        }
        return result > 0? result:0;
    }
}