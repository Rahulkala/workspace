
public class GoDaddy1 {

	/**
	 * @param args
	 */
	public int[] mergeArrays(int a[], int b[]){
		
		int len=a.length;
        int merge[]=new int[len*2];
        int i=0;		// for array a
        int j=0;		// for array b
        int k=0;		// for the new array
        while(i!=len && j!=len){
        	
        	if(a[i]<b[j]){
        		
        		merge[k++]=a[i];
        		i++;
        	}
        	else{
        		
        		merge[k++]=b[j];
        		j++;
        	}
        }
        while(i!=len){
        	
        	merge[k++]=a[i++];
        }
        while(j!=len){
        	
        	merge[k++]=b[j++];
        }
		return merge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4};
		int arr2[]={2,4,6,8};
		int sol[];
		GoDaddy1 s=new GoDaddy1();
		sol=s.mergeArrays(arr, arr2);
		for(int a: sol){
			
			System.out.print(a);
		}
	}

}
