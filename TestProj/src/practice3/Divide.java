package practice3;

public class Divide {

	public int divide(int dividend, int divisor) {
       
		int count=0,a,b,flag=0;
		if(dividend<0 && divisor>0 || dividend>0 && divisor<0)
			flag=-1;
		else
			flag=1;
		if(divisor==1)
			return dividend;
		if(dividend>Integer.MAX_VALUE || divisor>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(dividend<=Integer.MIN_VALUE || divisor<=Integer.MIN_VALUE)
			return Integer.MAX_VALUE;
		if(divisor==0)
			return Integer.MAX_VALUE;
		a=(dividend>0)?dividend:Math.abs(dividend);
		b=(divisor>0)?divisor:Math.abs(divisor);
		// O(n) solution
		/*while(a>=b){
			
			count++;
			a-=b;
		}
		*/
		// log(n) solution
		while(a>=b){
			
			int temp=b;
			int res=1;
			while(temp<=a){
				
				temp=temp<<1;
				res=res<<1;
			}
			temp=temp>>1;
			res=res>>1;
			count+=res;
			a-=temp;
		}		 
		return flag*count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divide d=new Divide();
		System.out.println(d.divide(2147483647,2));
	}

}
