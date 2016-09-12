
public class FiboCount {

	int Count(int low, int high){
		
		int count=0;
		int f1=0, f2=1, f3=1;
		
		while(f1<=high){
			
			if(f1>=low)
				count++;
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		return count;
	}
	public static void main(String arg[]){
		
		FiboCount fc=new FiboCount();
		System.out.println("There are "+fc.Count(1, 10)+" Fibonnaci Number.");
	}
}
