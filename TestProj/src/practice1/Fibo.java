package practice1;

import java.util.*;

public class Fibo {

	public static int[] memo=new int[100];
	
	public static int fibo(int n){
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		/*else if(memo[n]!=0)
			return memo[n];
		*/	
		else{
			
			int f=fibo(n-1)+fibo(n-2);
			memo[n]=f;
			return f;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		memo[0]=0;
		memo[1]=1;
		int n=25;
		fibo(n);
		int i=0;
		for(int m:memo){
			if(i++>=n)
				break;
			System.out.println(m);
		}
		
	}

}
