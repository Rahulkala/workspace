/*
 *Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.
 * 
 * */
class Node{
	
	int data;
	Node next;
	public Node(){
		
		data=0;
	}
	public Node(int d){
		
		data=d;
	}
}
public class OddEvenLL {

	public static void main(String arg[]){
		
		Node start, last;
		start=last=null;
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++){
			
			Node n = new Node(arr[i]);
			if(start==null){
				
				start=n;
				last=n;
				n.next=null;
			}
			else{
			
				last.next=n;
				last=n;
			}
		}
		Node temp=start;
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		temp=null;
		Node odd=start;
		Node prev=null;
		Node even=null;
		while(odd!=null){
			
			if(temp==null){
				
				temp=odd.next;
				even=temp;
			}
			else{
				
				temp.next=odd.next;
				temp=temp.next;
			}
			odd.next=odd.next.next;
			prev=odd;
			odd=odd.next;
		}
		prev.next=even;
		temp=start;
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
