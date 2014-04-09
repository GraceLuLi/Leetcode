public class JumpGameII {
    public int jump(int[] A) {
        if(A.length <= 1){
            return 0;
        }
        return jumpHelper(A, 0);
    }
    public int jumpHelper(int[] A, int index){
        if(index >= A.length){
            return 0;
        }
        int maxStep = index + A[index];
        if(maxStep >= A.length-1){
            return 1;
        }
        int nextIndex = Integer.MIN_VALUE;
        int nextMaxStep = Integer.MIN_VALUE;
        for(int i = index + 1; i <= maxStep; ++i){
            if(A[i] + i > nextMaxStep){
                nextIndex = i;
                nextMaxStep = A[i] + i;
            }
        }
        int nextJump = jumpHelper(A, nextIndex);
        if(nextJump == 0){
            return 0;
        }
        else{
            return 1+nextJump;
        }
    }
}


