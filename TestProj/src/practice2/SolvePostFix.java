/*
* To solve PostFix Notation
*/
package practice2;

import java.util.*;

public class SolvePostFix{

	static boolean flag=false;
	public int generate(String str){

		Stack<Integer> stack=new Stack<Integer>();
		int operand1,operand2,ans=0;
		try{
			for(int i=0;i<str.length();i++){
	
				if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
	
					if(stack.peek()!=null&&!stack.isEmpty())
						operand2=stack.pop();
					else
						return -1;
					if(stack.peek()!=null&&!stack.isEmpty())
						operand1=stack.pop();
					else
						return -1;
					switch(str.charAt(i)){
	
						case '+': operand1+=operand2;break;
						case '-': operand1-=operand2;break;
						case '*': operand1*=operand2;break;
						case '/':
							 if(operand2!=0)
							 	operand1/=operand2;
							 else
								return -1;
							break;
						default: flag=false;return -1;	
					}
					stack.push(operand1);
				}
				else
					stack.push(Integer.parseInt(str.charAt(i)+""));
			}
			ans=stack.pop();
			
		}catch(Exception e){
			
			
		}
		if(stack.size()==0)
			flag=true;
		else
			flag=false;
		return ans;
	}
	public static void main(String arg[]){

		SolvePostFix pf=new SolvePostFix();
		//System.out.println(pf.generate("16+5*23*+"));
		int ans=pf.generate("13+62*7+*");
		if(flag)
			System.out.println(ans);
		else
			System.out.println("Invalid");
	}
}