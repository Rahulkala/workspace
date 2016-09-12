/*
 * To compress string aaabbbcccc to a3b3c4
 * aaaabcd to a4bcd
 */
public class CompressString {

	public String compress(String s){
		
		StringBuilder str=new StringBuilder();
		StringBuilder str1=new StringBuilder(s+" ");
		char ch='`';
		int count=0;
		for(int i=0;i<str1.length()-1;i++){
			
			if(ch=='`')
				ch=str1.charAt(i);
			count++;
			if(ch!=str1.charAt(i+1)){
				
				str.append(ch);
				if(count>1)
					str.append(count);
				ch='`';
				count=0;
			}
		}
		return str.toString();
	}
	public static void main(String arg[]){
		
		CompressString cs=new CompressString();
		System.out.println(cs.compress("rahul kala"));
	}
}
