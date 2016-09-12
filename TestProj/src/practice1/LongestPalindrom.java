package practice1;

public class LongestPalindrom {

	public String palindrom(String s){
		
		int start=0, pal_len=0,n=s.length();
		int check[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i==j)
					check[i][j]=1;
				else
					check[i][j]=0;
		for(int i=0;i<n-1;i++){
			
			if(s.charAt(i)==s.charAt(i+1)){
				
				check[i][i+1]=1;
				start=i;
				pal_len=2;
			}
		}
		for(int k=3;k<=n;k++){
			
			for(int i=0;i<n-k+1;i++){
				
				int j=i+k-1;
				if((s.charAt(i)==s.charAt(j)) &&(check[i+1][j-1]==1)){
					
					check[i][j]=1;
					pal_len=k;
					start=i;
				}
			}
		}
		if(pal_len==0)
			return "No Palindrom Substring found";
		return s.substring(start, start+pal_len);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalindrom lp=new LongestPalindrom();
		System.out.println(lp.palindrom(new String("rahul")));
	}

}
