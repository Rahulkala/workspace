/*
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 */
public class PerfectSquareSum {

	public void numSquares(int n) {
    
    	int temp=n;
    	int count=0;
    	if(Math.abs(Math.sqrt(n) - (int)Math.sqrt(n))==0)
    		count=1;
    	else{

    		for(int i=n-1;i>1;i--){

    			if((Math.abs(Math.sqrt(i) - (int)Math.sqrt(i))==0)&&temp!=0&&temp-i>=0){

    				if(temp%i==0){		// if multiple of square makes the whole sum  

    					count+=temp/i;	// count will be the number of times that number divides
    					break;
    				}	
    				temp-=i;
    				i=temp;				// to start the next search for square which will be
    									// equal or less than the remaining amount in sum.
    				count++;
    			}
			}
			count+=temp;			// To add the remaining as it will be to add 1 to the sum		
    	}		
		System.out.println(count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquareSum ps=new PerfectSquareSum();
		ps.numSquares(12);
	}

}
