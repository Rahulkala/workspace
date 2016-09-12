package practice3;

public class InorderTree {

	public void inorder(Tree root){
		
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
