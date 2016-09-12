/*
 * one way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.

     _9_
    /   \
   3     2
  / \   / \
 4   1  #  6
/ \ / \   / \
# # # #   # #
For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.

Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.

Each comma separated value in the string must be either an integer or a character '#' representing null pointer.

You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".


 */

// Only work when single numeric digit is used, not with number greater than 9
// Need to change to int for solving this problem

import java.util.*;

public class PreorderVerify {

	public Stack<String> hashcheck(Stack<String> s){
		
		String c;
		if(!s.isEmpty() && s.peek().equals("#")){
			
			c=s.pop();
			if(!s.isEmpty() && s.peek().equals("#")){
				
				s.pop();
				if(s.isEmpty()){
					
					s.push("*");
					return s;
				}	
				s.pop();
				s.push("#");
				s=hashcheck(s);
			}
			else{
				
				s.push(c);
			}
		}
		return s;
	}
	public boolean check(String preorder){
		
		Stack<String> stack=new Stack<String>();
		String[] str=preorder.split(",");
		for(int i=0;i<str.length;i++){
			
			if(stack.isEmpty() || !str[i].equals("#")){
				
				stack.push(str[i]);
			}	
			else if(str[i].equals("#") && stack.peek().equals("#")){
				
				stack.push("#");
				stack=hashcheck(stack);
			}
			else{
			
				stack.push(str[i]);
			}	
		}
		if(stack.size()==1 && stack.peek().equals("#"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="9,3,4,#,#,1,#,#,2,#,6,#,#";
		PreorderVerify pv=new PreorderVerify();
		System.out.println(pv.check(s));
	}

}

