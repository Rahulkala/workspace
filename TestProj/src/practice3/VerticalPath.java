/*
 * Binary Tree1 Vertical Order Path
 */
package practice3;

import java.util.*;

class Tree1{
	
	int d;
	Tree1 left;
	Tree1 right;
	Tree1(int data){
		
		d=data;
		left=right=null;
	}
}
public class VerticalPath {

	//static int level=0;
	public void inorder(Tree1 root, int level, Map<Integer, String> map){
		
		if(root==null){

			level-=1;
			return;
		}	
		else{
			
			inorder(root.left,level+1,map);
			if(!map.containsKey(level))
				map.put(level, root.d+"");
			else
				map.put(level, map.get(level)+root.d);
			inorder(root.right,level-1,map);
		}
	}
	public Map<Integer,String> createMap(Tree1 root){

		int level=0;
		Map<Integer, String> map=new HashMap<>();
		inorder(root,level,map);
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree1 root = new Tree1(1);
		root.left = new Tree1(2);
		root.right = new Tree1(3);
		root.left.left = new Tree1(4);
		root.left.right = new Tree1(5);
		root.right.left = new Tree1(6);
		root.right.right = new Tree1(7);
		VerticalPath vp=new VerticalPath();
		//root=null;
		Map<Integer,String> map=vp.createMap(root);
		for(int i:map.keySet()){
			
			System.out.println(map.get(i));
		}
		//System.out.print(map);
	}

}
