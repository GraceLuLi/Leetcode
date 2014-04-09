
public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
         if(root == null){
             return;
         }
         getflattenEnd(root);
    }

    public TreeNode getflattenEnd(TreeNode root){
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left == null && right == null){
             return root;
         }
        TreeNode p = root;
        p.left = null;
         if(left != null){
             TreeNode leftEnd = getflattenEnd(left);
             p.right = left;
             p = leftEnd;
         }
         if(right != null){
             TreeNode rightEnd = getflattenEnd(right);
             p.right = right;
             p = rightEnd;
        }
         return p;
    }
}

