public class ConstructBTfromPreInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       
          return buildTreeHelper(preorder, inorder, 0,preorder.length-1, 0, inorder.length-1);
        
    }
    public TreeNode buildTreeHelper(int[] preorder, int[] inorder, int s1,int e1, int s2, int e2){
    	if(s1 > e1 || s2 > e2){
    		return null;
    	}
    	int val = preorder[s1];
    	TreeNode node = new TreeNode(val);
    	int k = s2;
    	while(k <= e2){
    		if(inorder[k] == val){
    			break;
    		}
    		++k;
    	}
    	node.left = buildTreeHelper(preorder, inorder, s1+1,s1+(k-s2), s2, k-1);
    	node.right = buildTreeHelper(preorder, inorder, s1+(k-s2)+1,e1,k+1, e2);   	
    	return node;
    }
}