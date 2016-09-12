/*
 * Find common minimum of the 2 Non-Empty array or else return -1
 * 
 */

package practice2;

import java.util.*;

public class Min2Array {

	public int minSame(int[] a, int[] b){
		
		int min=-1;
		if(a!=null && a.length!=0 && b!=null && b.length!=0 ){
			
			try{
				
				Set<Integer> set=new HashSet<Integer>();
				for(int i=0;i<a.length;i++)
					set.add(a[i]);
				for(int i=0;i<b.length;i++){
					
					if(set.contains(b[i])){
						
						if(min==-1)
							min=b[i];
						else if(min>b[i]){
							
							min=b[i];
						}
					}
				}
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min2Array ma=new Min2Array();
		int[] a={4,2,6,8,5,3,7,9};
		int[] b={4,1,2};
		System.out.println(ma.minSame(a, b));
	}

}
