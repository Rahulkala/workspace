package practice3;

class Root{
	
	int data;
	Root left,right;
	Root(int d){
		
		data=d;
		left=right=null;
	}
}
public class LargestKelement {

	static int answer=Integer.MIN_VALUE;
	static int k;
	public void reverseinorder(Root root){
		
		if(root==null)
			return;
		reverseinorder(root.right);
		if(k==1)
			answer=root.data;
		k--;
		reverseinorder(root.left);
	}
	public int klargest(Root root, int kth){
		
		if(root==null || kth<1)
			return Integer.MIN_VALUE;
		k=kth;
		reverseinorder(root);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestKelement lke=new LargestKelement();
		Root t1=new Root(50);
		t1.left=new Root(30);
		t1.right=new Root(70);
		t1.left.left=new Root(20);
		t1.left.right=new Root(40);
		t1.right.left=new Root(60);
		t1.right.right=new Root(80);
		System.out.println(lke.klargest(t1, 7));
	}

}
