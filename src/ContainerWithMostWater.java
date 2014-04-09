public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int len = height.length;
        if(len <= 1){
            return 0;
        }
        int i = 0;
        int j = len-1;
        int preLevel = 0;
        int result = 0;
        while(i < j){
            int h1 = height[i];
            int h2 = height[j];
            if(h1 > h2){
                result += (j-i)*(h2 - preLevel);
                preLevel = h2;
                while(j >= 0 && height[j] <= h2){
                    --j;
                }
            }
            else{
                result += (j-i)*(h1 - preLevel);
                preLevel = h1;
                while(i < len && height[i] <= h1){
                    ++i;
                }
            }
        }
        return result;
    }
}