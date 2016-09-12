/* 
 * Return the missing integer from the given array of AP
 * (Eg: [1,3,7,9]=5) 
 */
package practice3;

public class ArithmeticSequence {

	public int missing(int[] arr){
		
		int val=0;
		boolean flag=false;
		if(arr!=null && arr.length!=0){
			
			int diff;
			diff=(arr[arr.length-1]-arr[0])/(arr.length-1);
			int start=arr[0];
			for(int i=0;i<arr.length;i++){
				
				if(start==arr[i]){
					
					start+=diff;
				}
				if(start+diff==arr[i]){
					
					flag=true;
					val=start;
					break;
				}
			}
		}
		if(flag)
			return val;
		else
			return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,5,9,11};
		ArithmeticSequence as=new ArithmeticSequence();
		int val=as.missing(arr);
		if(val==Integer.MIN_VALUE)
			System.out.println("No Missing Value found in Array");
		else
			System.out.println(val);
	}

}
