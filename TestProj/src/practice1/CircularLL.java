package practice1;

public class CircularLL {

	public Node insert(Node start,Node n){
		
		if(start==null){
		
			n.next=n;
			return n;
		}	
		if(start.data>n.data){
			
			if(start.next==start){
				
				start.next=n;
			}
			n.next=start;
			start=n;
		}
		else{
			
			Node temp=start.next;
			Node prev=start;
			while(temp!=start){
				
				if(temp.data>n.data){
					
					prev.next=n;
					n.next=temp;
					return start;
				}
				prev=temp;
				temp=temp.next;
			}
			n.next=prev.next;
			prev.next=n;
		}
		return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(1);
		Node n5=new Node(5);
		Node n6=new Node(6);
		Node start=null;
		CircularLL cll=new CircularLL();
		start=cll.insert(start, n2);
		Node temp;
		start=cll.insert(start, n1);
		start=cll.insert(start, n5);
		start=cll.insert(start, n3);
		start=cll.insert(start, n6);
		start=cll.insert(start, n4);
		temp=start.next;
		System.out.println(start.data);
		while(temp!=start){
			
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
