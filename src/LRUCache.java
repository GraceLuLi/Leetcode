import java.util.*;

public class LRUCache {
	HashMap<Integer, Node> map;
	Node head, tail;
	int capacity;
	
	public LRUCache(int capacity) {
    	map = new HashMap<Integer, Node>();
    	head = new Node(-1, -1);
    	tail = new Node(-1, -1);
    	head.next = tail;
    	tail.pre = head;
    	this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
        	Node p = map.get(key);
        	putToHead(p);
        	return p.val;
        }
        return -1;
    }
    
    public void set(int key, int value) {
    	if(map.containsKey(key)){
    		Node p = map.get(key);
    		p.val = value;
    		putToHead(p);
    	}
    	else if(map.size() < capacity){
    		Node p = new Node(key, value);
    		putToHead(p);
    		map.put(key, p);
    	}
    	else{
    		Node p = new Node(key, value);
    		int tmpK = removeEnd();
    		map.remove(tmpK);
    		map.put(key, p);
    		putToHead(p);
    	}
    	
    }
    public int removeEnd(){
    	Node p = tail.pre;
    	p.pre.next = tail;
    	tail.pre = p.pre;
    	p.next = null;
    	p.pre = null;   
    	return p.key;
    }
    
    public void putToHead(Node p){
    	if(p.pre != null && p.next != null){
    		p.pre.next = p.next;
    		p.next.pre = p.pre;
    	}
    	p.next = head.next;
    	p.pre = head;
    	head.next.pre = p;
    	head.next = p;
    }
    
    class Node{
    	Node pre;
    	Node next;
    	int key;
    	int val;
    	Node(int key, int val){
    		this.key = key;
    		this.val = val;
    		pre = null;
    		next = null;
    	}
    }
}