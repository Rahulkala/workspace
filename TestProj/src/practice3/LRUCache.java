package practice3;

import java.util.*;

class Node{
	
	int value,key;			// Key is used at the time of deletion
	Node next,prev;
	Node(int k,int d){
		
		key=k;
		value=d;
		next=prev=null;
	}
}
public class LRUCache {

	int c, capc;
	Map<Integer, Node> map=new HashMap<>();
	Node start, end;
	public LRUCache(int capacity) {
        
		capc=c=capacity;
    }
    
    public int get(int key) {
        
    	if(map.containsKey(key)){
    		
    		Node n=map.get(key);
    		if(capc!=c-1 && start.value!=n.value && n.next.value==start.next.value)
    			start=addTostart(start,n);
    		return n.value;
    	}
    	else
    		return -1;
    }
    public Node addTostart(Node start, Node n){
    	
    	n.prev.next=n.next;
		n.next.prev=n.prev;
		n.next=start;
		start.prev=n;
		n.prev=null;
		start=n;
		return start;
    }
    public void set(int key, int value) {
        
    	if(map.isEmpty()){
    	
    		Node n=new Node(key,value);
    		start=end=n;
    		map.put(key, n);
    		capc--;
    	}
    	else{
    		
    		if(map.containsKey(key)){
    			
    			Node n=map.get(key);
    			if(end.prev!=null && end.prev.value==n.prev.value && n.value==end.value){
    				
    				end=n.prev;
    				end.next=null;
    			}
    			n.value=value;
    			if(capc!=c-1)
    				start=addTostart(start,n);
    		}
    		else{
    			
    			Node n=new Node(key,value);
    			n.next=start;
    			start.prev=n;
    			start=n;
    			if(capc==0){
    				
    				Node temp=end;
    				map.remove(temp.key);
    				temp=null;
    				end=end.prev;
    				end.next=null;
    			}
    			else{
    				
    				capc--;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache lru=new LRUCache(2);
		lru.set(2,1);
		lru.set(1,1);
		System.out.println(lru.get(2));
		lru.set(4,1);
		System.out.println(lru.get(1));
		System.out.println(lru.get(2));
	}

}
