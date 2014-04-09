import java.util.ArrayList;

public class populatingNextPointer {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        root.next = null;
        ArrayList<TreeLinkNode> preLevel = new  ArrayList<TreeLinkNode>();
        preLevel.add(root);
        ArrayList<TreeLinkNode> currLevel;
        while(true){
            currLevel = new ArrayList<TreeLinkNode>();
            for(TreeLinkNode node : preLevel){
                if(node.left != null){
                    currLevel.add(node.left);
                }
                if(node.right != null){
                    currLevel.add(node.right);
                }
            }
            if(currLevel.size() == 0){
                return;
            }
            for(int i=0; i < currLevel.size()-1; ++i){
                TreeLinkNode node = currLevel.get(i);
                node.next = currLevel.get(i+1);
            }
            (currLevel.get(currLevel.size()-1)).next = null;
            preLevel = currLevel;
        }
    }
}
