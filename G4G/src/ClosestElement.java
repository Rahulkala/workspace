/*
Find three closest elements from given three sorted arrays
Given three sorted arrays A[], B[] and C[], find 3 elements i, j and k from A, B and C respectively such that max(abs(A[i] – B[j]), abs(B[j] – C[k]), abs(C[k] – A[i])) is minimized. Here abs() indicates absolute value.

Example :

Input: A[] = {1, 4, 10}
       B[] = {2, 15, 20}
       C[] = {10, 12}
Output: 10 15 10
10 from A, 15 from B and 10 from C

Input: A[] = {20, 24, 100}
       B[] = {2, 19, 22, 79, 800}
       C[] = {10, 12, 23, 24, 119}
Output: 24 22 23
24 from A, 22 from B and 23 from C
*/

public class ClosestElement {

	void closest(int a[], int b[], int c[]){
		
		int len_a=a.length, len_b=b.length, len_c=c.length;
		int i,j,k,min,max,diff;
		diff=Integer.MAX_VALUE;
		i=j=k=0;
		int res_a=0 ,res_b=0,res_c=0;
		while(i<len_a && j<len_b && k<len_c){
			
			min=Math.min(a[i],Math.min(b[j], c[k]));
			max=Math.max(a[i],Math.max(b[j], c[k]));
			if(max-min<diff){
				
				res_a=i;
				res_b=j;
				res_c=k;
				diff=max-min;
			}
			if(diff==0)
				break;
			
			if(a[i]==min)
				i++;
			else if(b[j]==min)
				j++;
			else
				k++;
		}
		System.out.println("The closest elements of 3 arrays are "+a[res_a]+" "+b[res_b]+" "+c[res_c]);
	}
	public static void main(String arg[]){
		
		int a[]={20, 24, 100}, b[]={2, 19, 22, 79, 800}, c[]={10, 12, 23, 24, 119};
		ClosestElement closest=new ClosestElement();
		closest.closest(a, b, c);
	}
}
