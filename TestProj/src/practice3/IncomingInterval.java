package practice3;

import java.util.*;

public class IncomingInterval {

	int count=0;
	Set<Integer> set=new HashSet<>();
	public int interval(int start, int end){
		
		if(start>end)
			return count;
		while(start<=end){
			
			if(!set.contains(start)){
				
				set.add(start);
				count++;
			}
			start++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomingInterval ii=new IncomingInterval();
		System.out.println("Count: "+ii.interval(5, 9));
		System.out.println("Count: "+ii.interval(1, 4));
		System.out.println("Count: "+ii.interval(-7, 3));
	}

}
