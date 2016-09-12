// To check if the given array is either increasing or decreasing?

package practice3;

public class Monotonic {

	public boolean check(int[] arr){
		
		boolean up=false,down=false;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]>arr[i+1]){
				
				down=true;
				if(up)
					return false;
			}
			else if(arr[i]<arr[i+1]){
				
				up=true;
				if(down)
					return false;
			}
		}
		return (up || down);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monotonic m=new Monotonic();
		int arr[]={3,1,2,3,4,5};
		System.out.println(m.check(arr));
	}

}
