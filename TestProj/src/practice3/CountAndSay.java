/*
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */
package practice3;

public class CountAndSay {

	public String countAndSay(int n){
		
		String s="11";
		if(n==0)
			return null;
		if(n==1)
			return 1+"";
		if(n==2)
			return 11+"";
		for(int i=2;i<n;i++){
			
			StringBuilder temp=new StringBuilder();
			char prev=s.charAt(0);
			int count=1;
			for(int j=1;j<s.length();j++){
				
				if(s.charAt(j)==prev){
					
					count++;
				}
				else{
					
					temp.append(count);
					temp.append(prev);
					count=1;
					prev=s.charAt(j);
				}
			}
			temp.append(count);
			temp.append(prev);
			s=temp.toString();
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay cs=new CountAndSay();
		System.out.println(cs.countAndSay(5));
		System.out.println(cs.countAndSay(6));
		System.out.println(cs.countAndSay(7));
	}

}
