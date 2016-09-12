package interview;

import java.util.*;

public class Party{
	
	static HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	public int check(int lines){

		if(map.containsKey(lines))
			return map.get(lines);
		else{
		
			if(lines%2==0){

				lines/=2;
				int temp=(int)Math.pow(lines,2);
				map.put(lines*2,temp);
				return temp;
			}
			else{

				int l=lines+1;
				int temp=check(l)-l/2;
				map.put(lines,temp);
				return temp;
			}
		}	
	}
	public void chocolate(int[] lines){

		for(int i=0;i<lines.length;i++){

			System.out.println(check(lines[i]));
		}
	}
	public static void main(String arg[]){

		Party p=new Party();
		int[] arr={5,6,7,8};
		p.chocolate(arr);
	}
}
