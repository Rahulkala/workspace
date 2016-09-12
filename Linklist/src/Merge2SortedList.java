/*
 * Merge 2 sorted List
 * 
 */

public class Merge2SortedList {

	public Node mergeList(Node a, Node b){
		
		Node startA,startB;
		Node merge=null, startM=null;
		startA=a;
		startB=b;
		while(startA!=null && startB!=null){
			if(merge==null){
				if(startA.data<startB.data){
					merge=startA;
					startA=(startA.next!=null)? startA.next:null;
				}	
				else{
					merge=startB;
					startB=(startB.next!=null)? startB.next:null;
				}	
				startM=merge;
			}
			else if(startA.data<startB.data){
				merge.next=startA;
				merge=merge.next;
				startA=(startA.next!=null)? startA.next:null;
			}
			else{
				merge.next=startB;
				merge=merge.next;
				startB=(startB.next!=null)? startB.next:null;
			}
			System.out.println("Merge: "+merge.data);
			merge.next=null;
		}
		if(startA!=null){
			merge.next=startA;
		}
		if(startB!=null){
			merge.next=startB;
		}Node temp=startM;		System.out.println(" Now return temp");
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		return startM;
	}
	public static void main(String arg[]){
		
		Node startA=null;
		Node startB=null;
		Node last=null;
		int arr[]={1,2,3,4};
		int arr2[]={2,4,6,8};
		//LL A creation start
		for(int i=0;i<arr.length;i++){
			
			Node n = new Node(arr[i]);
			if(startA==null){
				
				startA=n;
				last=n;
				n.next=null;
			}
			else{
			
				last.next=n;
				last=n;
			}
		}
		// LL A creation ends and display
		Node temp=startA;
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		//LL B creation start
		last=null;
		for(int i=0;i<arr2.length;i++){
			
			Node n = new Node(arr2[i]);
			if(startB==null){
				
				startB=n;
				last=n;
				n.next=null;
			}
			else{
			
				last.next=n;
				last=n;
			}
		}
		temp=startB;
		System.out.println();
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		Merge2SortedList msl=new Merge2SortedList();
		Node m=msl.mergeList(startA,startB);
		temp=m;
		System.out.println();
		while(temp!=null){
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
