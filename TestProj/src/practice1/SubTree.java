package practice1;

//SOL 1
//time O(nm) or O(n + km) k is the number of occurrences of tr2's root in tr1
//space O(log n + log m) recursion

class Tree{
	
	int val;
	Tree left;
	Tree right;
	public Tree(int x){
		val=x;
	}
}
public class SubTree {

	public int check(Tree tr1, Tree tr2){
		if(tr2==null)
			return 1;
		if(subtree(tr1,tr2))
			return 1;
		else
			return -1;
	}
	public boolean subtree(Tree tr1, Tree tr2){
		
		if(tr1==null)
			return false;
		else if(tr1.val==tr2.val && checksubtree(tr1,tr2))
			return true;
		return (subtree(tr1.left,tr2) || subtree(tr1.right,tr2));
	}
	public boolean checksubtree(Tree tr1,Tree tr2){
										// use example to explain this
		if(tr1==null && tr2==null)		// because of the recursion it needs to be checked
			return true;
		else if(tr1==null || tr2==null)
			return false;
		else if(tr1.val!=tr2.val)
			return false;
		else
			return (checksubtree(tr1.left,tr2.left) && checksubtree(tr1.right,tr2.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t1=new Tree(5);
		Tree t2=new Tree(10);
		System.out.println(t1.hashCode()+" - "+t2.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
