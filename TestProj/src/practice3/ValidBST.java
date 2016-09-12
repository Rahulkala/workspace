package practice3;

public class ValidBST {
	
	/*
	 * Or can use In-order(time complexity will be O(n)) traversal and store the current n previous values so as 
	 * to save space complexity
	 * If not then the space complexity will be O(n)
	 */
	public boolean checkValid(Tree root, int max,int min){
		
		if(root==null)
			return true;
		if(root.data>min && root.data<max && checkValid(root.left, root.data,min) && checkValid(root.right,max,root.data))
			return true;
		return false;
	}
	public boolean validBST(Tree root){
		
		if(root==null)
			return true;
		if(checkValid(root, Integer.MAX_VALUE,Integer.MIN_VALUE))
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
