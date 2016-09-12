/*
 * Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
 */

/*
 * Here power of 3 means 3^x=n
 * 
 * taking log on both side 
 * 
 * x=log(n)/log(3);
 */
public class PowerofThree {

	public static void main(String arg[]){
		
		int n=Integer.parseInt(arg[0]);
		double x = Math.log(n)/Math.log(3);
		if(Math.abs(x-Math.rint(x))<=0.0000000000001)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
