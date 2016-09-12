/*
 * Given a sorted positive integer array nums and an integer n, 
 * add/patch elements to the array such that any number in range [1, n] 
 * inclusive can be formed by the sum of some elements in the array. 
 * Return the minimum number of patches required.

Example 1:
nums = [1, 3], n = 6
Return 1.

Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
So we only need 1 patch.

Example 2:
nums = [1, 5, 10], n = 20
Return 2.
The two patches can be [2, 4].

Example 3:
nums = [1, 2, 2], n = 5
Return 0.
 */

import java.util.*;

public class PatchArray {

	// Efficient Solution
	public int minPatches1(int[] nums, int n){
		
		int count = 0, i = 0;
        for (long covered=0; covered < n; ) {
            if ((i<nums.length && nums[i]>covered+1) || i>=nums.length) {  // at this moment, we need (covered+1), patch it.
                covered += covered+1;
                ++count;
                System.out.println(covered+" Inside if"+i);
            } else { covered += nums[i++]; }
        }
        return count;
	}
	
	// O(n^2) solution
	public int minPatches(int[] nums, int n) {
		
        TreeSet<Integer> set=new TreeSet<Integer>();
        int count=0;
        try{
        	
	        for(int num:nums){
	        	
	        	if(set.isEmpty()){
	        		
	        		set.add(num);
	        		continue;
	        	}
	        	if(!set.contains(num)){
	        		
	        		Set<Integer> s=new TreeSet<Integer>(set);
	        		Iterator it=s.iterator();
	        		while(it.hasNext()){
	        			
	        			int temp=(int)it.next()+num;
	        			if(!set.contains(temp))
	        				set.add(temp);
	        		}
	        		set.add(num);
	        	}
	        	else{
	        		
	        		Set<Integer> s=new TreeSet<Integer>(set);
	        		Iterator it=s.iterator();
	        		while(it.hasNext()){
	        			
	        			int temp=(int)it.next()+num;
	        			if(!set.contains(temp))
	        				set.add(temp);
	        		}
	        	}
	        }
        }catch(Exception e){
        	
        	e.printStackTrace();
        }
        int i=1;
        while(set.size()<n){
        	
        	if(set.contains(i)){

        		i++;
        		continue;
        	}	
        	if(!set.contains(i)){
        		
        		count++;
        		Set<Integer> s=new TreeSet<Integer>(set);
        		Iterator it=s.iterator();
        		while(it.hasNext()){
        			
        			int temp=(int)it.next()+i;
        			if(!set.contains(temp))
        				set.add(temp);
        		}
        		set.add(i);
        	}
        	i++;
        }
        Iterator it1=set.iterator();
		while(it1.hasNext()){
			
			System.out.println(it1.next());
		}
        System.out.println("Size: "+set.size());
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,5,10};
		/*
		 * [1,2,31,33]
2147483647
		 */
		PatchArray pa=new PatchArray();
		System.out.println(pa.minPatches1(num, 20));
	}

}
