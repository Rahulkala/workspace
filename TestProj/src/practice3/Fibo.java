package practice3;

public class Fibo {

	public long cal(int n){
		
		long sum=0;
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		else{
			
			long first=0,second=1;
			for(int i=3;i<=n;i++){
				
				sum=first+second;
				first=second;
				second=sum;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo f=new Fibo();
		long startTime = System.currentTimeMillis();
		System.out.println(f.cal(50));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
