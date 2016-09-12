/*
 * Reverse second half of linked list
   e.g. 1-2-3-4-5-6 change to 1-2-3-6-5-4, 1-2-3-4-5 change to 1-2-5-4-3
 * 
 */

package practice1;

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
public class ReverseLL {

	public void reverse(Node n){
		
		Node temp1, temp2, prev;
		prev=null;
		temp1=temp2=n;
		try{
		
			while(temp2.next!=null && temp2.next.next!=null){

				prev=temp1;
				temp1=temp1.next;
				temp2=temp2.next.next;
			}
			if(temp2.next!=null){

				prev=temp1;
				temp1=temp1.next;
			}	
		}catch(Exception e){
			
			e.printStackTrace();
		}
		Node rev=null,temp3=null;
		temp2=null;
		while(temp1!=null){
			
			if(rev==null){
				
				rev=temp1;
				temp3=temp1.next;
				rev.next=null;
			}
			else{
				
				temp3=temp1.next;
				rev.next=temp2;
			}
			temp1=temp3;
			temp2=rev;
			rev=temp1;
		}
		prev.next=temp2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start=null;
		Node last=null;
		int arr[]={1,2,3,4,5,6,7};
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
		ReverseLL rl=new ReverseLL();
		rl.reverse(start);
		System.out.println();
		Node temp=start;
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
