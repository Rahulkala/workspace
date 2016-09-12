package practice3;

import java.util.*;

public class ThreeSum {

	public List<List<Integer>> sum1(int[] nums){
		
		Arrays.sort(nums);
		Set set=new HashSet();
		for(int i=0;i<nums.length;i++){
			
			for(int j=i+1, k=nums.length-1;j<k;){
				
				if(nums[i]+nums[j]+nums[k]<0)
					j++;
				else if(nums[i]+nums[j]+nums[k]>0)
					k--;
				else{
					
					ArrayList<Integer> l1=new ArrayList<Integer>();
					l1.add(nums[i]);
					l1.add(nums[j]);
					l1.add(nums[k]);
					set.add(l1);
					j++;
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}
	public List<List<Integer>> sum(int[] nums){
		
		Set<List<Integer>> s=new HashSet<List<Integer>>();
		Map<String, Integer> map=new HashMap<String, Integer>();
		Arrays.sort(nums);
		if(nums!=null && nums.length!=0){
			
			for(int i=0;i<nums.length;i++){
				
				for(int j=i+1;j<nums.length;j++){
					
					map.put(nums[i]+","+nums[j],-1*(nums[i]+nums[j]));
				}
			}
			for(int i=0;i<nums.length;i++){
				
				Set set=map.keySet();
				Iterator<String> it=set.iterator();
				while(it.hasNext()){
					
					String val=it.next();
					ArrayList<Integer> l1=new ArrayList<Integer>();
					if(map.containsValue(map.get(val))){
						
						String st[]=val.split(",");
						int min=Integer.parseInt(st[0]);
						int max=Integer.parseInt(st[1]);
						if(nums[i]>max && min+max+nums[i]==0){
							
							l1.add(min);
							l1.add(max);
							l1.add(nums[i]);
						}
						else if(nums[i]<min && min+max+nums[i]==0){
							
							l1.add(nums[i]);
							l1.add(min);
							l1.add(max);
						}
					}
					s.add(l1);
				}
			}
		}
		return new ArrayList<List<Integer>>(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums={-1,0,1,2};
		int[] nums={-4,9,-10,2,-6,-3,-6,6,0,8,-3,-10,6,-7,3,-6,-5,7};
		ThreeSum ts=new ThreeSum();
		long startTime = System.currentTimeMillis();
		System.out.println(ts.sum1(nums));
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	}

}
