import java.util.ArrayList;

public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
    	
    	int[] result = sumNumbersHelper(root);
    	return result == null? 0:result[0];
    }

    
    public int[] sumNumbersHelper(TreeNode node){
    	
    	if(node == null)
    	{
    		return null;
    	}
    	if(node.left == null && node.right == null)
    	{
    		int[] r = {node.val, 10};
    		return r;
    	}
    	int[] info = new int[2];
    	int[] leftInfo = sumNumbersHelper(node.left);
    	int[] rightInfo = sumNumbersHelper(node.right);
    	
    	int leftInfo0 = (leftInfo == null? 0:leftInfo[0]);
    	int leftInfo1 = (leftInfo == null? 0:leftInfo[1]);
    	
    	int rightInfo0 = (rightInfo == null? 0:rightInfo[0]);
    	int rightInfo1 = (rightInfo == null? 0:rightInfo[1]);
    	
    	info[0] = leftInfo0 + rightInfo0 + node.val * (leftInfo1 + rightInfo1);
    	info[1] = 10*(leftInfo1 + rightInfo1);
    	return info;
    
    }
    
}