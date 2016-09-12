package practice1;

public class LongestCommonSubstr {

	public String common(String s1,String s2){
		
		int len=0,start=0;
		for(int i=0;i<s1.length();i++){
			
			for(int j=0;j<s2.length();j++){
				
				int ptr=0;
				while(s1.charAt(i+ptr)==s2.charAt(j+ptr)){
					
					ptr++;
					if(i+ptr>=s1.length() || j+ptr>=s2.length())
						break;
					if(ptr>len){
						
						len=ptr;
						start=i;
					}
				}
			}
		}
		return s1.substring(start,start+len);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubstr l=new LongestCommonSubstr();
		System.out.println(l.common("Commondynamicprogrammingimplementations", "grammingjskimplem"));
	}

}
