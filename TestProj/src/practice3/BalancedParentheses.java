package practice3;

import java.util.*;

public class BalancedParentheses {

	public String filter(String str){
		
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<Character>();
		Stack<Integer> pos=new Stack<>();
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='('){
				
				stack.push(str.charAt(i));
				if(sb.length()==0)
					pos.push(0);
				else{
					
					pos.push(sb.length());
				}
			}
			else if(str.charAt(i)==')'){
				
				if(stack.isEmpty())
					continue;
				sb.append(')');
				stack.pop();
				int p=pos.pop();
				sb.insert(p, '(');
			}
			else{
				
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedParentheses par=new BalancedParentheses();
		System.out.println(par.filter("abc"));
	}

}
