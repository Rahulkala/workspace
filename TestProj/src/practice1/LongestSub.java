package practice1;

public class LongestSub {

	
	//final solution
	public int longestsubstr(String s1,String s2){
		
		if(s1==null || s2==null || s1.length()==0 || s2.length()==0)
			return 0;
		int maxl=0;
		int len1=s1.length(),len2=s2.length();
		int check[][]=new int[len1+1][len2+1];
		for(int i=0;i<=len2;i++)
			check[0][i]=0;
		for(int i=0;i<=len1;i++)
			check[i][0]=0;
		for(int i=1;i<len1;i++){
			
			for(int j=1;j<len2;j++){
				
				if(s1.charAt(i)==s2.charAt(j)){
					
					check[i][j]=check[i-1][j-1]+1;
					if(check[i][j]>maxl)
						maxl=check[i][j];
				}
			}
		}
		return maxl+1;
	}
	//============
	//Solution 1
	// runtime and space isO(n^2)
	public static String longestSubstr(String s){
		
		if(s==null || s.length() == 0)
			return null;
		String rst=null;
		int max=0;
		// D[i][j] represents that whether substring palindromic between i j
		boolean[][] D= new boolean[s.length()][s.length()];
		for(int j=0;j<s.length();j++){
			
			for(int i=0;i<=j;i++){
				
				D[i][j] = s.charAt(i) == s.charAt(j) && (j-i<=2 ||D[i+1][j-1]);
				if(D[i][j])
					if(j-i+1>max){
						
						max = j-i+1;
						rst=s.substring(i,j+1);
					}
			}
		}
		return rst;
	}
	public static void main(String arg[]){
		
		System.out.println(new LongestSub().longestsubstr("Rahul","ahxl"));
	}
}
