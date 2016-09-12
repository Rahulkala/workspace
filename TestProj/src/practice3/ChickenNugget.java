package practice3;

public class ChickenNugget {

	static boolean[] arr;
	public boolean nuggets(int n){
		
		if(n<0)
			return false;
		else if(n==0)
			return true;
		if(arr[n])
			return true;
		arr[n]=nuggets(n-6)||nuggets(n-9)||nuggets(n-20);
		return arr[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChickenNugget cn=new ChickenNugget();
		int n=22;
		arr=new boolean[n+1];
		System.out.println(cn.nuggets(n));
	}

}
