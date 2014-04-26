/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
import java.util.*;

public class CloneGraph {
	public class UndirectedGraphNode {
	     int label;
	     ArrayList<UndirectedGraphNode> neighbors;
	     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if(node == null){
    		return null;
    	}
    	HashMap<Integer,UndirectedGraphNode> checker = new HashMap<Integer,UndirectedGraphNode>();
    	return clone(node, checker);
    }
    public UndirectedGraphNode clone(UndirectedGraphNode node, HashMap<Integer,UndirectedGraphNode> checker){
    	if(checker.containsKey(node.label)){
    		return checker.get(node.label);
    	}

    	UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
    	checker.put(newNode.label, newNode);
    	for(UndirectedGraphNode each : node.neighbors){
    		newNode.neighbors.add(clone(each, checker));
    	}
    	return newNode;
    }
}
