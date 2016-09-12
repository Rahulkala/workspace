package practice3;

import java.util.*;

public class PhoneNumberCombination {

	static List<String> list=new ArrayList<>();
	public void combine(String s,boolean flag){
		
		char[] cs=s.toCharArray();
		List<String> l=new ArrayList<>();
		if(flag){
			
			for(int i=0;i<cs.length;i++)
				list.add(cs[i]+"");
		}
		else{
			
			for(int i=0;i<cs.length;i++){
				
				Iterator<String> it=list.iterator();
				while(it.hasNext()){
					
					l.add(it.next()+cs[i]);
				}
			}
			list=new ArrayList<>(l);
		}	
	}
	public List<String> combination(String digits){
		
		if(digits==null || digits=="")
			return list;
		String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		for(int i=0;i<digits.length();i++){
			
			if(digits.charAt(i)<'0' && digits.charAt(i)>'9')
				return null;
			int a=Integer.parseInt(digits.charAt(i)+"");
			String s=map[a];
			if(list.isEmpty())
				combine(s, true);
			else
				combine(s,false);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumberCombination nc=new PhoneNumberCombination();
		long min=System.currentTimeMillis();
		System.out.println(nc.combination("22"));
		long max=System.currentTimeMillis();
		System.out.println(max-min);
	}

}
