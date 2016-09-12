
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
public class SingleLinkList {
	
	public static void main(String arg[]){
		
		Node start=null;
		Node last=null;
		int arr[]={1,2,3,4};
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
	}
}
