/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
import java.util.*;
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<Integer, RandomListNode> checker = new HashMap<Integer, RandomListNode>();
        RandomListNode n = copyList(head, checker);
        return n;
    }
    public RandomListNode copyList(RandomListNode node, HashMap<Integer, RandomListNode> checker){
    	if(node == null){
    		return null;
    	}
    	if(checker.containsKey(node.label)){
    		return checker.get(node.label);
    	}
    	RandomListNode newNode = new RandomListNode(node.label);
    	checker.put(newNode.label, newNode);
    	newNode.next = copyList(node.next, checker);
    	newNode.random = copyList(node.random, checker);
    	return newNode;
    }
}
