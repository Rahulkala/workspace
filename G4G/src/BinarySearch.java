
public class BinarySearch {

	int findIndex(int arr[], int x){
		
		int max=arr.length;
		int min=0;
		while(min<=max){
			
			if(arr[(min+max)/2]==x){
				
				return (min+max)/2+1;
			}
			if(arr[(min+max)/2]>x){
				
				max=(min+max)/2;
			}
			else{
				
				min=(min+max)/2;
			}
		}
		return -1;
	}
	public static void main(String arg[]){
		
		int arr[]={1,4,6,19,30,31,32,45,48,51,53,58,64,69,70,85,89,100,105,106,115,199,200,253,900};
		System.out.println("The element is found at index "+new BinarySearch().findIndex(arr, 900));
	}
}
