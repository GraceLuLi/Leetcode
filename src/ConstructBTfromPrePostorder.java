public class ConstructBTfromPrePostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder,0,inorder.length-1,postorder,0,postorder.length-1); 
     }
     
     public TreeNode buildTreeHelper(int[] inorder, int s1, int e1, int[] postorder,int s2, int e2 ){
     	
     	if(s1 > e1 || s2 > e2){
     		return null;
     	}
     	int val = postorder[e2];
     	TreeNode node = new TreeNode(val);
     	int k = s1;
     	while(k <= e1 && inorder[k] != val){	
     		++k;
     	}
     	if(k > e1){
     		return null;
     	}
     	node.left = buildTreeHelper(inorder, s1, k-1,postorder, s2, s2 +k-s1-1);
     	node.right = buildTreeHelper(inorder, k+1, e1,postorder, s2+k-s1, e2-1);
     	return node;
     }
}
