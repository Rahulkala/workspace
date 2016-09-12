/*
 * 
 * To merge 2 sorted array into the arrays given
 * The First array must contain all the most smallest elements 
 * The second array must contain elements greater than 
 * the last element of the first array
 * 
 * eg:
 * a[] = {1, 5, 9, 10, 15, 20};
   b[] = {2, 3, 8, 13};
 *  
 * Solution:
 * a[] = {1,2,3,5,8,9}
 * b[] = {10,13,15,20} 
 */
public class MergeSortArray {

	public static void main(String arg[]){
		
		int ar2[] = {1, 5, 9, 10, 15, 20};
	    int ar1[] = {2, 3, 8, 13};
	    int len,temp;
	    
	    len=(ar1.length<ar2.length)?ar1.length:ar2.length;
	    if(ar1.length>ar2.length){					// check if ar1>ar2
	    											// else condition to check if ar2>ar1
		    for(int i=len-1;i>=0;i--){
		    	
		    	if(ar1[ar1.length-1]>ar2[i]){
		    		
		    		temp=ar2[i];
		    		ar2[i]=ar1[ar1.length-1];
		    		ar1[ar1.length-1]=temp;
		    	}
		    	int j=ar1.length-1;
		    	while(j>0 && ar1[j]<ar1[j-1]){
		    		
		    		temp=ar1[j];
		    		ar1[j]=ar1[j-1];
		    		ar1[j-1]=temp;
		    		j--;
		    	}
		    	System.out.println("\nAfter iteration "+ (len-i));
		    	System.out.print("Array 1: ");
		    	for(int k=0;k<ar1.length;k++){
			    	
			    	System.out.print(ar1[k]+" ");
			    }
			    System.out.print("\nArray 2: ");
			    for(int m=0;m<ar2.length;m++){
			    	
			    	System.out.print(ar2[m]+" ");
			    }
			    System.out.print("");
		    }
	    }
	    else{
	    	
	    	for(int i=len-1;i>=0;i--){
		    	
		    	if(ar2[ar2.length-1]>ar1[i]){
		    		
		    		temp=ar1[i];
		    		ar1[i]=ar2[ar2.length-1];
		    		ar2[ar2.length-1]=temp;
		    	}
		    	int j=ar2.length-1;
		    	while(j>0 && ar2[j]<ar2[j-1]){
		    		
		    		temp=ar2[j];
		    		ar2[j]=ar2[j-1];
		    		ar2[j-1]=temp;
		    		j--;
		    	}
		    	System.out.println("\nAfter iteration "+ (len-i));
		    	System.out.print("Array 1: ");
		    	for(int k=0;k<ar2.length;k++){
			    	
			    	System.out.print(ar2[k]+" ");
			    }
			    System.out.print("\nArray 2: ");
			    for(int m=0;m<ar1.length;m++){
			    	
			    	System.out.print(ar1[m]+" ");
			    }
			    System.out.print("");
	    	}    
	    }
	}
}
