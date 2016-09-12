package practice3;

public class BinarySum {

	public String addBinary(String a, String b) {
        
		int i,j,carry=0;
		if(a==null || b==null)
			return null;
		if(a.length()==0 && b.length()==0)
			return null;
		StringBuilder a1=new StringBuilder(a);
		StringBuilder b1=new StringBuilder(b);
		StringBuilder ans=new StringBuilder();
		for(i=a1.length()-1,j=b1.length()-1;i>=0 || j>=0;i--,j--){
			
			int first=(i<0)?0:Integer.parseInt(a1.charAt(i)+"");
			int second=(j<0)?0:Integer.parseInt(b1.charAt(j)+"");
			int sum=first+second+carry;
			if(sum==0 || sum==2){
				
				ans.insert(0,"0");
				carry=(sum==2)?1:0;
			}
			else if(sum==1 || sum==3){
				
				ans.insert(0, "1");
				carry=(sum==3)?1:0;
			}
		}
		if(carry==1)
			ans.insert(0, "1");
		return ans.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySum bs=new BinarySum();
		System.out.println(bs.addBinary("",""));
	}
}
