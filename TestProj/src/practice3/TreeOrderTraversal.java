/*
 * Return the tree nodes as per the level
 * [[1], [2, 3], [4, 5, 6, 7], [8]]
 * 
 */

package practice3;

import java.util.*;

class Tree{
	
	int data;
	Tree left;
	Tree right;
	public Tree(int d){
		
		data=d;
		left=null;
		right=null;
	}
}
public class TreeOrderTraversal {

	static List<List<Integer>> l=new ArrayList<List<Integer>>();
	static Queue<Tree> q1=new ArrayDeque<Tree>();
	Queue<Tree> q2;
	public Queue<Tree> child(Queue<Tree> q){
		
		q2=new ArrayDeque<Tree>();
		List<Integer> l1=new ArrayList<Integer>();
		while(!q.isEmpty()){
			
			Tree node=q.poll();
			if(node.left!=null){

				q2.add(node.left);
				l1.add(node.left.data);
			}
			if(node.right!=null){

				q2.add(node.right);
				l1.add(node.right.data);
			}	
		}
		if(!l1.isEmpty())
			l.add(l1);
		return q2;
	}
	public List traverse(Tree start){
		
		List<Integer> l1=new ArrayList<Integer>();
		if(start==null)
			return null;
		else{
			
			q1.add(start);
			l1.add(start.data);
			l.add(l1);
			while(!q1.isEmpty())
				q1=child(q1);
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t1=new Tree(1);
		Tree t2=new Tree(2);
		Tree t3=new Tree(3);
		t1.left=t2;
		t1.right=t3;
		Tree t4=new Tree(4);
		Tree t5=new Tree(5);
		t2.left=t4;
		t2.right=t5;
		Tree t6=new Tree(6);
		Tree t7=new Tree(7);
		t3.left=t6;
		t3.right=t7;
		Tree t8=new Tree(8);
		t4.left=t8;
		TreeOrderTraversal tt=new TreeOrderTraversal();
		System.out.println(tt.traverse(t1));
	}

}
