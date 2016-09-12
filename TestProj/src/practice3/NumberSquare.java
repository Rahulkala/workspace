/*
 * To check if the given number is a Square root of an Integer or not
 * 
 */

package practice3;

public class NumberSquare {

	public boolean isSqrt(int n){
		
		int start, last, mid;
		start=0;
		last=n;
		if(n==1)				// boundary condition
			return true;
		while(start!=last-1){
			
			mid=(start+last)/2;
			if(mid*mid==n)
				return true;
			else if(mid*mid<n)
				start=mid;
			else
				last=mid;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberSquare ns=new NumberSquare();
		//for(int i=1;i<100;i++){
			int i=10;
			System.out.println(ns.isSqrt(i));
		//}
	}

}
