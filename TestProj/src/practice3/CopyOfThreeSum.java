package practice3;

import java.util.*;

public class CopyOfThreeSum {

	public void sum(int[] nums){
		
		boolean flag=false;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		if(nums!=null && nums.length!=0){
			
			for(int i=0;i<nums.length;i++)
				map.put((-1)*nums[i], i);
			for(int i=0;i<nums.length;i++){
				for(int j=i;j<nums.length;j++){
					try{
					
						while(map.containsKey(nums[i]+nums[j])){
							
							if(nums[i]<=nums[j] && i!=j){

								int temp=map.remove(nums[i]+nums[j]);
								if(nums[j]<=nums[temp] && j!=temp){
									
									flag=true;
									System.out.println("["+nums[i]+","+nums[j]+","+nums[temp]+"]");
								}	
							}	
						}
					}catch(Exception e){
						
						e.printStackTrace();
					}
				}
			}
			if(!flag)
				System.out.println("No such pairs found");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums={-1,2,3,4,-1,0};
		int[] nums={0,0,0};
		CopyOfThreeSum ts=new CopyOfThreeSum();
		ts.sum(nums);
	}

}
