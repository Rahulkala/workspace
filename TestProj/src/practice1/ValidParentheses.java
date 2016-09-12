package practice1;

import java.util.*;

public class ValidParentheses {

	public boolean isValid(String s){
		
		if(s==null || s.length()==0)
			return true;
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			
			if(stack.isEmpty())
				stack.push(s.charAt(i));
			else if(s.charAt(i)-stack.peek()==1 ||s.charAt(i)-stack.peek()==2)
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses vp=new ValidParentheses();
		System.out.println(vp.isValid("{{}{}{}{{{{]}}}}"));
	}

}
